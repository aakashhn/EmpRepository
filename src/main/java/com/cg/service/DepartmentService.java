package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DepartmentDao;
import com.cg.entity.Department;
import com.cg.repository.DepartmentRepository;

@Service
public class DepartmentService implements DepartmentDao {



	@Autowired
	DepartmentRepository dr;



//	public String addVehicle(Department v) {
//
//		dr.save(v);
//
//		return "Department added.....";
//	}
//
//	public List<Department> getAllVehicle() {
//
//		return dr.findAll();
//
//	}

	@Override
	public String addDepartment(Department d) {
		dr.save(d);
		return "Department added.....";
	}

	@Override
	public List<Department> getAllDepartment() {
		
		return dr.findAll();
	}
}
