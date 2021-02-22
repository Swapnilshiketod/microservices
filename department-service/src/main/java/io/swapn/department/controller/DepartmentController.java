package io.swapn.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swapn.department.entity.Department;
import io.swapn.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department){
		System.out.println("inside controllers saveDepartment()");
		System.out.println(department);
		return departmentService.saveDepartMent(department);
	}

	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") long departmentId){
		System.out.println("Inside Controllers findDepartmentById()");
		return departmentService.findDepartmentById(departmentId);
	}
}
