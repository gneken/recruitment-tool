package se.kth.iv1201.spring.web.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import se.kth.iv1201.spring.web.dao.Role;
import se.kth.iv1201.spring.web.service.RoleService;


@Component
public class RoleEditor extends PropertyEditorSupport {

	private @Autowired RoleService roleService;

	// Converts a String to a Role (when submitting form)
	@Override
	public void setAsText(String text) {
		Role r = this.roleService.findById(Long.valueOf(text));
		this.setValue(r);
	}

}