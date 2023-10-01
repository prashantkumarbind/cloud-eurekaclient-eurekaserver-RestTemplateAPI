package com.pksoftware.controller.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(url="http://localhost:8789", value="supervisor")
public interface SupervisorFeign {
	
	  @PutMapping("supervisorname/{id}")
	  public String getSupervisorName(@PathVariable int id);

}
