package com.kynikoi.learn_notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class HeavyResourse {



    public HeavyResourse(@Qualifier("SMS") NotificationService notificationService){

        System.out.println("HeavyResourse is created");
    }


}
