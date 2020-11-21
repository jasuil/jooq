package com.example.demo;

import org.jooq.DSLContext;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

//import static com.example.demo.generates.Tables.POSTS;

@SpringBootTest
public class JooqApplicationTests {

	@Autowired
	DSLContext dslContext;

	//@Test
	public void tryWhenJooqGenerateTest() {
		// List<Map<String, Object>> list = dslContext.selectFrom(POSTS).fetchMaps();
		//  Assertions.assertTrue(list.size() > 0);
	}

}

