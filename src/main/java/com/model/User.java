package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;

@Entity(name = "sys_user")
public class User {
	@TableGenerator(name = "TABLE_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "PERSON_ID", initialValue = 10, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	@Column(name = "id", nullable = false,unique = true)
	private Integer userId;
	private String userName;
	private String password;
	@ManyToMany
	private List<Role> roles;

}
