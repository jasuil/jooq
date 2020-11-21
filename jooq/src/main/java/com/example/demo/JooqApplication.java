package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class JooqApplication implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(JooqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Map<String, Object>> list = postRepository.selectPostAll();
		System.out.println(list.size());
	}
}
