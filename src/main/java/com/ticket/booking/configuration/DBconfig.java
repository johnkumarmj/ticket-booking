package com.ticket.booking.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DBconfig {

    @ConfigurationProperties(prefix = "spring.datasource.hikari")


    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }


   @Bean
    public JdbcTemplate createJdbcTemplate_ProductService() {
        return new JdbcTemplate(datasource());


    }
}