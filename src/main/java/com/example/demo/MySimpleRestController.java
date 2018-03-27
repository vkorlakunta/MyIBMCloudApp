/**
 * 
 */
package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vkorlak@us.ibm.com
 *
 */
@RestController
public class MySimpleRestController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String processFlightEvents() {
		return "Hello..Venkat";
	}
			

}
