# jooq
jooq-very simple project for beginner


0. h2database install 
and data.sql, schema.sql query commit.
or you can choose in <h3>application.properties
=> #spring.datasource.initialization-mode=NEVER</h3>

1. remove package com.example.demo.generate
2. postsRepository.java discovered error, you shuold comment the error line.
3. in console, mvn compile -P generate
4. if you'd choosen 
application.properties
=> #spring.datasource.initialization-mode=NEVER,
<br/>then revert it(remove '#' ok? ).
