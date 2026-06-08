package com.kynikoi.learn_notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnNotificationApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(LearnNotificationApplication.class, args);
        var notificationManager = context.getBean(NotificationManager.class);
        var notificationManager2 = context.getBean(NotificationManager.class);
        notificationManager2.sendNotification("EmailNotificationService");
        context.close();
    }


}
