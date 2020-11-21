# spring-jooq:  maven setting project

## this goal: generate java-translated schema source from jooq, flyway and h2
```
1. $> mvn flyway:migrate
then create new h2 file in base dir
 
but found some error use this command 
$> mvn flyway:repair 
or $> delete h2_data.*

2. $> mvn jooq-codegen:generate
or $> mvn compile -P jooq-generate

you can see java-translated schema file in 
src/main/java/com/example/demo/generates

now, test and implement your project
```