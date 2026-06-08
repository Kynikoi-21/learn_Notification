package com.kynikoi.learn_notification;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {

    @Bean
    public EmailNotificationService Email(){
        return new EmailNotificationService();
    }
    @PostConstruct
    public void init(){
        System.out.println("PostConstruct already created");
    }
    @PreDestroy
    public void cleanup(){
        System.out.println("NotificationManager Predestroy");
    }

    @Bean
    public NotificationManager notificationManager(){
        return new NotificationManager(Email());
    }

}
