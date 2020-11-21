package com.example.demo;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Map;


@Repository
public class PostRepository {

    @Autowired
    DSLContext dslContext;

    public List<Map<String, Object>> selectPostAll(){
        // return dslContext.selectFrom(POSTS).fetchMaps();
        return Collections.EMPTY_LIST;
    }
}
