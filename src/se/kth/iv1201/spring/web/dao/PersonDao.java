package se.kth.iv1201.spring.web.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component("personDao")
public class PersonDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	
	public void create(Person person) {
		session().save(person);
	}

	
	public boolean exists(String username) {
		Criteria crit = session().createCriteria(Person.class);
		crit.add(Restrictions.idEq(username));
		Person person = (Person)crit.uniqueResult();
		return person != null;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		return session().createQuery("from Person").list();
	}

}
