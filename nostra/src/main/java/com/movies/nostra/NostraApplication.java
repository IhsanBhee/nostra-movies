package com.movies.nostra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Nostra API", version = "1.0", description = "Enjoy Watching Films with Nostra Movies"))
public class NostraApplication {

	public static void main(String[] args) {
		SpringApplication.run(NostraApplication.class, args);
	}

}
