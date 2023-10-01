package com.pksoftware.controller.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://localhost:8788", value="hr")
public interface HumanResourceFeign {
	
		@DeleteMapping("/humanname/{id}")
		public String getHrName(@PathVariable int id);

}
