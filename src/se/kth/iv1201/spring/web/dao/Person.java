package se.kth.iv1201.spring.web.dao;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import se.kth.iv1201.spring.web.validation.ValidEmail;


@Entity
@Table(name="person")
public class Person implements Serializable {

	private static final long serialVersionUID = 5362437768854142524L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="person_id")
	private int id;
	
	@NotNull
	@Size(min=3,max=255,message="Name must be between 3 and 255 charachter long")
	private String name;
	@NotNull
	@Size(min=3,max=255,message="Surname must be between 3 and 255 charachter long")
	private String surname;
	@NotNull
	@Size(min=3,max=255,message="SSN must be between 3 and 255 charachter long")
	private String ssn;
	@NotNull
	@ValidEmail(min=6, message="This email adress is not valid.")
	private String email;
	@NotNull
	@Size(min=3,max=255,message="Password must be between 3 and 255 charachter long")
	private String password;
	@NotNull
	@Size(min=3,max=255,message="Username must be between 3 and 255 charachter long")
	private String username;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="role_id")
	private Role role;

	public Person() {}

	public Person(String name, String surname, String ssn, String email,
			String password, String username, Role role) {
		super();
		this.name = name;
		this.surname = surname;
		this.ssn = ssn;
		this.email = email;
		this.password = password;
		this.username = username;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}


}

