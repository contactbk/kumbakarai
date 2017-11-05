package com.pkm.kumba.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(value="com.pkm.kumba.repository")
@EnableTransactionManagement
public class JDBCConfig {

    @Autowired
    private Environment env;
    @Bean
    public DataSource datasource(){
        System.out.println("[JDBCConfig][dataSource] url = " + env.getProperty("jdbc.url"));
        DriverManagerDataSource datasource=new DriverManagerDataSource();
        datasource.setDriverClassName("org.mariadb.jdbc.Driver");
        datasource.setUrl(env.getProperty("jdbc.url"));
        datasource.setUsername(env.getProperty("jdbc.user"));
        datasource.setPassword(env.getProperty("jdbc.password"));
        return datasource;
    }



    Properties additionalProperties(){
        Properties properties=new Properties();
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        return properties;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        JpaTransactionManager transactionManager=new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
        return new PersistenceExceptionTranslationPostProcessor();
    }

}
