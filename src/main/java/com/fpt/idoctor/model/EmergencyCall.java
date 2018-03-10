package com.fpt.idoctor.model;
// Generated Mar 8, 2018 8:26:25 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Emergencycall generated by hbm2java
 */
@Entity
@Table(name = "emergencycall")
public class EmergencyCall implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private User toUser;
	private User fromUser;
	private Date time;
	private String status;

	public EmergencyCall() {
	}

	public EmergencyCall(Long id) {
		this.id = id;
	}

	public EmergencyCall(Long id, User toUser, User fromUser, Date time,
			String status) {
		this.id = id;
		this.toUser = toUser;
		this.fromUser = fromUser;
		this.time = time;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "toUserId")
	public User getToUser() {
		return this.toUser;
	}

	public void setToUser(User toUser) {
		this.toUser = toUser;
	}

	@ManyToOne
	@JoinColumn(name = "fromUserId")
	public User getFromUser() {
		return this.fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", length = 19)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "status", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
