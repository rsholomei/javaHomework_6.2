package com.geekhub.config;

import com.geekhub.model.Car;
import com.geekhub.model.Engine;
import com.geekhub.model.Tyres;
import com.geekhub.model.Wheels;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

@ComponentScan(basePackages = "com.geekhub")
@Configuration
@EnableTransactionManagement
@Profile("dev")
public class DevAppConfig {

    static Logger logger = Logger.getLogger(DevAppConfig.class.getName());

    @Value("${environments.dev.datasource.name}")
    private String nameDataSource;

    @Value("${environments.dev.datasource.name.script}")
    private String nameDataSourceScript;

    @Bean(name = "dataSource")
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .setName(nameDataSource)
                .setType(H2)
                .addScript(nameDataSourceScript)
                .build();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Tyres tyres(){
        logger.info("Created development tyres");
        return new Tyres();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Engine engine(){
        logger.info("Created development engine");
        return new Engine();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Wheels wheels(){
        logger.info("Created development wheels");
        return new Wheels();
    }

    @Bean(autowire = Autowire.BY_NAME)
    public Car car(){
        logger.info("Created development car");
        return new Car();
    }
}
