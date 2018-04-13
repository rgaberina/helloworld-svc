/**
 * 
 */
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author berina
 *
 */
@RestController
public class HelloController {
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello everyone!!";
	}

}
