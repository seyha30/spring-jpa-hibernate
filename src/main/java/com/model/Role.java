package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.*;

@Entity(name = "sys_role")
public class Role {
	@Id
	@GeneratedValue
	private Integer roleId;
	private String roleName;
	@ManyToMany(mappedBy = "roles")
	private List<User> users;

}
