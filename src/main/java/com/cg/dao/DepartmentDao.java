package com.cg.dao;

import java.util.List;

import com.cg.entity.Department;

public interface DepartmentDao {

	String addDepartment(Department d);

	List<Department> getAllDepartment();

}
