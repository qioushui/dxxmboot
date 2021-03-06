package com.dx;

import com.dx.system.config.TaskThreadPoolConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.dx.*.dao")
@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableConfigurationProperties({TaskThreadPoolConfig.class} )
public class DxBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DxBootApplication.class, args);
    }
}
