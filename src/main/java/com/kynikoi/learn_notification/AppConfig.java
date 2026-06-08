package com.kynikoi.learn_notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {

    @Bean
    public EmailNotificationService Email(){
        return new EmailNotificationService();
    }

    @Bean
    public NotificationManager notificationManager(){
        return new NotificationManager(Email());
    }

}
