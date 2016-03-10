package se.kth.iv1201.spring.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import se.kth.iv1201.spring.web.dao.Role;
import se.kth.iv1201.spring.web.dao.RoleDao;

@Service("roleService")
public class RoleService {
	
	private RoleDao roleDao;

	
	@Inject
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	public List<Role> getPublicRoles() {
		return roleDao.getPublicRoles();
	}

	public Role findById(Long id) {
		return roleDao.findById(id);
	}

	
}
