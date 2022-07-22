package com.movies.nostra;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.movies.nostra.service.CategoryService;
import com.movies.nostra.service.MovieService;

@SpringBootTest
class NostraApplicationTests {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private MovieService movieService;
	
	@Test
	void contextLoads() {
//		System.out.println( movieService.findAll() );
	}

}
