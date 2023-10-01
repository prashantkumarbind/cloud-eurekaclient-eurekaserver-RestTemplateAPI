package com.pksoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.pksoftware.controller.feignservice.EmployeeFeign;
import com.pksoftware.controller.feignservice.HumanResourceFeign;
import com.pksoftware.controller.feignservice.SupervisorFeign;

@Controller
public class ManagerController {

	
		@Autowired
		RestTemplate rs;
		// first we are use the RestTemplate exchange method 
	
		//object of the Feign 
		@Autowired
		EmployeeFeign employeeFeign;
		
		@Autowired 
		HumanResourceFeign hrFeign;
		
		@Autowired
		SupervisorFeign superFeign;
		@ResponseBody
		@GetMapping("manager/name/{id}")
		public String microsevice(@PathVariable int id) {
			
			/*
			 * System.out.println("<h1>USE OF THE RestTemplate Class exchange method  </hr>"
			 * );
			 * 
			 * ResponseEntity<String> empName =
			 * rs.exchange("http://localhost:8787/employeename/"+id, HttpMethod.POST, null,
			 * String.class); ResponseEntity<String> hrName =
			 * rs.exchange("http://localhost:8788/humanname/"+id, HttpMethod.DELETE, null,
			 * String.class); ResponseEntity<String> superName =
			 * rs.exchange("http://localhost:8789/supervisorname/"+id, HttpMethod.PUT, null,
			 * String.class); return ""+empName+"<br/>"+hrName+" <br>"+superName;
			 */
		
		
		//second we are use the RestTemplate getForObject method
		
		/*
		 * @ResponseBody
		 * 
		 * @GetMapping("manage1/name1/{id}") public String microservice1(@PathVariable
		 * int id) {
		 * 
		 * System.out.
		 * println("<h1>USE OF THE RestTemplate class get,post,put,delete for object</hr>"
		 * );
		 * 
		 * String empName1 =rs.getForObject("http://localhost:8787/name/"+id,
		 * String.class); String hrName1 =
		 * rs.getForObject("http://localhost:8788/name/"+id, String.class); String
		 * superName1 = rs.getForObject("http://localhost:8789/name/"+id, String.class);
		 * return empName1+" <br>"+hrName1+" <br>"+superName1;
		 * 
		 * }
		 */
		
		
		
		//****************************USE OF THE OpenFeign API ******************************************
		String emp = employeeFeign.getEmployeeName(id);
		String hr = hrFeign.getHrName(id);
		String supervisor = superFeign.getSupervisorName(id);
		
		return emp+hr+supervisor;
	}
		
}
