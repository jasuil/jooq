package com.example.demo;

import java.sql.Timestamp;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.genetate.tables.Posts;
import com.example.demo.repo.PostsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JooqApplicationTests {

	@Autowired
	private PostsRepository postsRepository;
	
	@Test
	@Transactional
	public void contextLoads() {
		
		Result<Record> result = postsRepository.findAll();
		
		  for (Record r : result) {
              String content = r.getValue(Posts.POSTS.CONTENT);
              String title = r.getValue(Posts.POSTS.TITLE);
              Timestamp date = r.getValue(Posts.POSTS.CREATED_ON);

              System.out.println("content: " + title + " first content: " + content + " date: " +  date);
          }
		  
		 int updateResult =  postsRepository.save("성일짱", "ㅎㅎㅎ");
		 
	}

}

