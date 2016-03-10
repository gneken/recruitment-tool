package se.kth.iv1201.spring.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
@Component("roleDao")
public class RoleDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}


	@SuppressWarnings("unchecked")
	public List<Role> getPublicRoles() {
		return session().createQuery("from Role where public=1").list();
	}

	public Role findById(Long id) {
		return (Role) session().get(Role.class, id.intValue());
	}



}
