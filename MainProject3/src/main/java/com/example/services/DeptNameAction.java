package com.example.services;

import java.util.List;

import com.example.entities.Complaint;
import com.example.entities.DeptName;

public interface DeptNameAction {
Complaint registerDeptName(DeptName deptname);
	
	//Complaint getComplaint(String description,String department, String date);
	
	List<DeptName> getAllDeptName(DeptName deptname);
	 
	DeptName getDept(int id);

}