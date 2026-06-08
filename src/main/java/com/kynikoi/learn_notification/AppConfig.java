package com.kynikoi.learn_notification;

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

    @Scope("prototype")
    @Bean
    public NotificationManager notificationManager(){
        return new NotificationManager(Email());
    }

}
