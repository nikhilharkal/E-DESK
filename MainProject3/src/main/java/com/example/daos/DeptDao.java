package com.example.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Complaint;
import com.example.entities.DeptName;;

public interface DeptDao  extends JpaRepository<DeptName, Integer> {
	
	//DeptName findByComplaintId(int parseInt);

	@Query(value="select * from deptname where dept_name=?1", nativeQuery=true)
	DeptName findbyDeptNo(String pincode);
	
		
}
