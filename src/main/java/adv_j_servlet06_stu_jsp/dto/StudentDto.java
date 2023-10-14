package adv_j_servlet06_stu_jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
//
//	@Override
//	public String toString() {
//		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", pswd=" + pswd + ", address="
//				+ address + ", phno=" + phno + ", fee=" + fee + "]";
//	}
	@Id
	private int id;
	private String name;
	private String email;
	private String pswd;
	private String address;
	private long phno;
	private double fee;
	
	
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
}
