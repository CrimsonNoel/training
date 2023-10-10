package model;

import java.sql.Date;

public class Member {
	private String id;
	private String pass;
	private String name;
	private int gender;
	private String tel;
	private String email;
	private String picture;
	private Date rdate;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass (String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Member [" + (id != null ? "id=" + id + ", " : "") + (pass != null ? "pass=" + pass + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + "gender=" + gender + ", "
				+ (tel != null ? "tel=" + tel + ", " : "") + (email != null ? "email=" + email + ", " : "")
				+ (picture != null ? "picture=" + picture + ", " : "") + (rdate != null ? "rdate=" + rdate : "") + "]";
	}
	
	
	
	
}
