package com.bulut.condition.configuration;

import com.bulut.condition.condition.VerifyTestCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {


    @Bean
    @Conditional(VerifyTestCondition.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
