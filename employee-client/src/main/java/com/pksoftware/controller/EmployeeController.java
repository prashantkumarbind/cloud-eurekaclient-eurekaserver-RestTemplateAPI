package com.pksoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //controller return only view As. html,jsp,thymeleaf
public class EmployeeController {

			
		  @ResponseBody
		  @PostMapping("/employeename/{id}")
		  public String employeeName(@PathVariable int id) {
			  
			    return "Employee Name::PRASHANT KUMAR";
		  }
}
