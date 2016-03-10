package se.kth.iv1201.spring.web.test;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import se.kth.iv1201.spring.web.dao.Person;
import se.kth.iv1201.spring.web.dao.Role;

public class PersonValidationTest {
	private static Validator validator;
	@Mock
	Role role = new Role("recruit");

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void personNameIsNull() {
		Person person = new Person();
		person.setName(null);
		person.setEmail("alihasan@kth.se");
		person.setPassword("1233232");
		person.setSurname("yusha");
		person.setSsn("sass");
		person.setUsername("gamiiis");
		person.setRole(role);
	

		Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

		assertEquals(1, constraintViolations.size());
		assertEquals("may not be null", constraintViolations.iterator().next().getMessage());
	}


	@Test
	public void personMailNotValid() {
		Person person = new Person();
		person.setName("ali");
		person.setEmail("alihasan");
		person.setPassword("1233232");
		person.setSurname("yusha");
		person.setSsn("sass");
		person.setUsername("gamiiis");
		person.setRole(role);
	

		Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

		assertEquals(1, constraintViolations.size());
		assertEquals("This email adress is not valid.", constraintViolations.iterator().next().getMessage());
	}

	@Test
	public void personPasswordIsShort() {
		Person person = new Person();
		person.setName("ali");
		person.setEmail("alihasan@kth.se");
		person.setPassword("1");
		person.setSurname("yusha");
		person.setSsn("sass");
		person.setUsername("gamiiis");
		person.setRole(role);
	

		Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

		assertEquals(1, constraintViolations.size());
		assertEquals("Password must be between 3 and 255 charachter long", constraintViolations.iterator().next().getMessage());
	}
	
	
}