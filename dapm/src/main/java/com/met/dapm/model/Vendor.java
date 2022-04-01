package com.met.dapm.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="Vendor")
public class Vendor {
	
	@Id
	String vendorID;
	String firstname;
	String lastname;
	String emailId;
	String password;
	String Gender;
	Date dob;
	String aadharno;
	String mobileno;
	String licencenumber ;
	String apmc;
	String bankname;
	String branchname;
	String accounttype;
	String accountnumber;
	String role;
	public String getVendorID() {
		return vendorID;
	}
	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getLicencenumber() {
		return licencenumber;
	}
	public void setLicencenumber(String licencenumber) {
		this.licencenumber = licencenumber;
	}
	public String getApmc() {
		return apmc;
	}
	public void setApmc(String apmc) {
		this.apmc = apmc;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Vendor [vendorID=" + vendorID + ", firstname=" + firstname + ", lastname=" + lastname + ", emailId="
				+ emailId + ", password=" + password + ", Gender=" + Gender + ", dob=" + dob + ", aadharno=" + aadharno
				+ ", mobileno=" + mobileno + ", licencenumber=" + licencenumber + ", apmc=" + apmc + ", bankname="
				+ bankname + ", branchname=" + branchname + ", accounttype=" + accounttype + ", accountnumber="
				+ accountnumber + ", role=" + role + "]";
	}
	
	

}
