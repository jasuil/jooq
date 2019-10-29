package com.example.demo;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.hellokoding.jooq.model.Tables.BROWSERVERIFICATION;

@org.springframework.stereotype.Repository
public class Repository {

    @Autowired
    DSLContext dslContext;

    @Transactional
    public void contextLoads() {
        List<String> list = dslContext.select(BROWSERVERIFICATION.CODE).from(BROWSERVERIFICATION).fetchInto(String.class);
        System.out.println(list);
    }
}
