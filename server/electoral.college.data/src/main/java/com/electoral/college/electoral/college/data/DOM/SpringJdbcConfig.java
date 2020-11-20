package com.electoral.college.electoral.college.data.DOM;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.electoral.college.electoral.college.data")
public class SpringJdbcConfig {
    @Bean
    public DataSource postgreSqlDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/PresidentialDB");
        dataSource.setUsername("PresidentialDBAdmin");
        dataSource.setPassword("qELgxa7GRvKgKJ");

        return dataSource;
    }

}
