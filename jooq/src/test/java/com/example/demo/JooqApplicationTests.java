package com.example.demo;

import java.util.List;

import org.jooq.DSLContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static com.hellokoding.jooq.model.Tables.BROWSERVERIFICATION;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JooqApplicationTests {

	@Autowired
	DSLContext dslContext;
	
	@Test
	@Transactional
	public void contextLoads() {
		List<String> list = dslContext.select(BROWSERVERIFICATION.CODE).from(BROWSERVERIFICATION).fetchInto(String.class);
		System.out.println(list);
	}

}

