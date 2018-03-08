package com.fpt.idoctor.model;
// Generated Mar 8, 2018 8:26:25 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Specialty generated by hbm2java
 */
@Entity
@Table(name = "specialty")
public class Specialty implements java.io.Serializable {

	private int id;
	private String name;
	private String description;
	private Set<User> users = new HashSet<User>(0);
	private Set<Disease> diseases = new HashSet<Disease>(0);

	public Specialty() {
	}

	public Specialty(int id) {
		this.id = id;
	}

	public Specialty(int id, String name, String description, Set<User> users, Set<Disease> diseases) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
		this.diseases = diseases;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "specialty")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "specialty")
	public Set<Disease> getDiseases() {
		return this.diseases;
	}

	public void setDiseases(Set<Disease> diseases) {
		this.diseases = diseases;
	}

}
