package com.pksoftware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SupervisorController {

		@ResponseBody
		@GetMapping("/test/{name}")
		public String getName(@PathVariable String name) {
			 
			 return "Your given name is the::"+name;
		}
		
		@ResponseBody
		@PutMapping("/supervisorname/{id}")
		public String getName(@PathVariable int id) {
			
			  return "Supervisor Name is the ::AMARENDRA KUMAR RATHOR";
		}
}
