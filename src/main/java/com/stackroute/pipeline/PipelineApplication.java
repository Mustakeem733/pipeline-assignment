package com.stackroute.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelineApplication.class, args);


	}

	@GetMapping("/all")
	public String test(){
		return "Hello From Pipelining";
	}

}
