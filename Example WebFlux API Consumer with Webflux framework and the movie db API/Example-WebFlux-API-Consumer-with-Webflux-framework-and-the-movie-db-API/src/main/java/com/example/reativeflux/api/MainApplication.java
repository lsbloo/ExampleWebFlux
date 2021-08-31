package com.example.reativeflux.api;

import com.example.reativeflux.api.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);

		System.err.println(context.getBean(MovieService.class).getMoviesPopularWithWebClient().blockFirst());
	}

}
