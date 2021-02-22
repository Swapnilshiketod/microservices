package io.swapn.cloud.gateway.circuitbraker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod(){
		return "User Service Unavailable , "
				+ "please check after some time";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod(){
		return "Department Service Unavailable , "
				+ "please check after some time";
	}
}
