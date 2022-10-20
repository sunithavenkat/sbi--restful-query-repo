package com.hcl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/score1")
public class QueryParameter2 {
    @GetMapping("/hi1")
	public String m1(@RequestParam(value="ssn",required=false,defaultValue="54654663") Long ssn) { 	
    	System.out.println("SSN::"+ssn);
			//retrieve fromm DB
		return "The value of FPD IS:6788";
	}
}
