package com.fpt.idoctor.api.request;

public class SignUpUserRequest {
	private String username;
	private String fullname;
	private String password;
	private String address;
	private String phone;
	private Boolean sex;
	private Long roleId;
	private Long specialtyId;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(Long specialtyId) {
		this.specialtyId = specialtyId;
	}
	
	
}