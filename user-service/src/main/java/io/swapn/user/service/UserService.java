package io.swapn.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.swapn.user.VO.Department;
import io.swapn.user.VO.ResponseTemplateVO;
import io.swapn.user.entity.User;
import io.swapn.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("inside saveUser() of userservice()");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		System.out.println("inside getUserWithDepartment() of userService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject(
												"http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId()
												, Department.class);
		vo.setUser(user);vo.setDepartment(department);
		return vo;
	}
}
