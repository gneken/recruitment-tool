package se.kth.iv1201.spring.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import se.kth.iv1201.spring.web.dao.Person;
import se.kth.iv1201.spring.web.dao.PersonDao;


@Service("personService")
public class PersonService {

	private PersonDao personDao;


	@Inject
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public List<Person> getPersons() {
		return personDao.getPersons();
	}


	public void create(Person person) {
		this.personDao.create(person);
	}




}
