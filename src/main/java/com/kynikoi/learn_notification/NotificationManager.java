package com.kynikoi.learn_notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*@Service*/
public class NotificationManager {

    private final NotificationService notificationService;


    public NotificationManager(@Qualifier("SMS") NotificationService notificationService){
        this.notificationService = notificationService;
        System.out.println("NotificationManager is created");
    }

    public void sendNotification(String message){
        notificationService.send(message);
    }
}
