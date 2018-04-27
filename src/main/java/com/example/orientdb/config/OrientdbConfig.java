package com.example.orientdb.config;

import com.orientechnologies.orient.core.db.OPartitionedDatabasePool;
import com.orientechnologies.orient.jdbc.OrientDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrientdbConfig {

    @Bean
    public OrientDataSource orientDataSource() {
        OrientDataSource dataSource = new OrientDataSource();
        dataSource.setDbUrl("plocal:C:/tmp/database/petshop");
        dataSource.setUsername("admin");
        dataSource.setPassword("111111");
        
        return dataSource;
    }


}
