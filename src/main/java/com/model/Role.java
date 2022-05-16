package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "sys_role")
public class Role {
	@Id
	@GeneratedValue
	private Integer roleId;
	private String roleName;
	@OneToOne
	private User user;

}
