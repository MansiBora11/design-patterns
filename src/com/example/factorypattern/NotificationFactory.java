package com.example.factorypattern;

public class NotificationFactory{
   public Notification createNotification(String type){
       if(type==null || type.isEmpty()){
           return null;
       }
       switch (type.toLowerCase()){
           case "sms":
               return new SMSNotification();
           case "email":
               return new EmailNotification();
           case "push":
               return new PushNotification();
           default:
               throw new IllegalArgumentException("Unknown notification type: "+type);
       }
   }
}
