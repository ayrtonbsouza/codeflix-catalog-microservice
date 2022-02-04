package com.ayrtonsouza.codeflix;

import com.ayrtonsouza.codeflix.domain.entity.Category;
import com.ayrtonsouza.codeflix.domain.entity.Genre;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CodeflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Genre genre = new Genre("Genre 1");
		Category category1 = new Category("Category 1");
		genre.addCategory(category1);
		System.out.println(genre);
	}

}
