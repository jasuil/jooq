package com.example.demo.repo;

import java.sql.Timestamp;
import java.util.Date;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.genetate.tables.Posts;


@Repository
@Transactional(readOnly = true)
public class PostsRepository {

	  private final DSLContext dslContext;

	  public PostsRepository(DSLContext dslContext) {
	    this.dslContext = dslContext;
	  }
	  
	  
	  @Transactional
	  public int save(String title, String content) {
	   return this.dslContext.insertInto(Posts.POSTS)
	      .columns(Posts.POSTS.CONTENT, Posts.POSTS.TITLE, Posts.POSTS.CREATED_ON)
	      .values(title, content, new Timestamp(System.currentTimeMillis())).execute();
	  } 
	  
	  public Result<Record> findAll() {
		  	Result<Record> result = this.dslContext.select().from(Posts.POSTS).fetch();		 
		    return result;		  
	  }
	  

}
