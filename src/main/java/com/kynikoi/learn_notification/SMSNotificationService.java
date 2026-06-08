package com.kynikoi.learn_notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service("SMS")
public class SMSNotificationService implements NotificationService{
    @Value("${SMS.apiUrl}")
    private String apiUrl;

    @Value("${SMS.enable}")
    private boolean enable;

    @Value("${SMS.timeout:2000}")
    private int timeout;

    @Value("${SMS.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void send(String message) {
        System.out.println("apiUrl"+apiUrl);
        System.out.println("enable"+enable);
        System.out.println("timeout"+timeout);
        System.out.println("currencies"+supportedCurrencies);
        System.out.println("Sending SMS:"+message);
    }
}
