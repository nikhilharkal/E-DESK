package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DeptName")
public class DeptName {
	
	@Id
  //@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="dept_no")
	private String deptno;
	
	@Column(name="dept_name")
	private String pincode;
	
	@Column(name="status")
	private String adharId;
	
	@OneToOne
	@JoinColumn(name="complaint_id")
	private Complaint complaintId ;

	public DeptName() {
		
	}

	public DeptName(String deptno, String pincode, String adharId, Complaint complaintId) {
		this.deptno = deptno;
		this.pincode = pincode;
		this.adharId = adharId;
		this.complaintId = complaintId;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAdharId() {
		return adharId;
	}

	public void setAdharId(String adharId) {
		this.adharId = adharId;
	}

	public Complaint getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Complaint complaintId) {
		this.complaintId = complaintId;
	}
	
	
	public DeptName(String pincode, String adharId) {
	
		this.pincode = pincode;
		this.adharId = adharId;
		//this.complaintId = complaintId;
	}

	
	

}