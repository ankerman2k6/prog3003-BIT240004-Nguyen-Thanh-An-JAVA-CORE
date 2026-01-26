/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhan.btchuong2.ex2;

/**
 *
 * @author nguyenthanhan
 */
public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }
        switch (channel.toUpperCase()) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException(channel + "Kênh thông báo không hợp lệ: ");
        }
    }
}
