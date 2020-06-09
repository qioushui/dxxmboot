package com.dx.system.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
// 该注解的locations已经被启用，现在只要是在环境中，都会优先加载
@Data
@ConfigurationProperties(prefix = "spring.task.pool")
public class TaskThreadPoolConfig {
    private int corePoolSize;

    private int maxPoolSize;

    private int keepAliveSeconds;

    private int queueCapacity;

}
