package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "sys_user")
public class User {
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String password;
	@ManyToOne
	private Role role;

}
