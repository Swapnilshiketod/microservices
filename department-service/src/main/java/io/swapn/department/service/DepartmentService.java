package io.swapn.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swapn.department.entity.Department;
import io.swapn.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartMent(Department department) {
		// TODO Auto-generated method stub
		System.out.println("inside saveDepartment() of service");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(long departmentId) {
		// TODO Auto-generated method stub
		System.out.println("inside findDepartmentById() of service");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
