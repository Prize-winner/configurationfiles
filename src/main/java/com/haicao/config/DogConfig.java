package com.haicao.config;

import com.haicao.entity.Dog;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

    @ConfigurationProperties(prefix = "dog")
    @Bean
    public Dog getDog(){
        return new Dog();
    }
}
