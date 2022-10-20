package com.hcl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score")
public class QueryParameter {
    @GetMapping("/hi")
	public String getRate(@RequestParam("ssn") Long ssn ) {
    	//logic retrive from db
		return "value is:1020";
	}
}
