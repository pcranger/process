package com.example.springmongodbqueries.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class ValidationConfig {
    //event listener, trigger when interract with db
    public ValidatingMongoEventListener validationMongoEventListener(){
        return new ValidatingMongoEventListener(validator());
    }
    //event listener will call this validator
    public LocalValidatorFactoryBean validator(){
        return new LocalValidatorFactoryBean();
    }
}
