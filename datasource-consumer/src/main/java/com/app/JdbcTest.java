package com.app;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by artur on 08/10/16.
 */

public class JdbcTest {
    private static final Logger logger = Logger.getLogger(JdbcTest.class.getName());
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplte;

    @PostConstruct
    public void init() {
        logger.info("JdbcTest - init");
        if (getDataSource() == null) {
            logger.info("data source is null");
        } else {
            logger.info("data source is not null");
        }
        jdbcTemplte = new JdbcTemplate(dataSource);
        //jdbcTemplte.execute("select * from users;");
        jdbcTemplte.execute("create table customer (name varchar(100), twittername varchar(100))");
        jdbcTemplte.execute("insert into customer (name, twittername) values ('Christian Schneider', '@schneider_chris')");
        logger.info("Init finished");

    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
