/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thanhan.btchuong2;

import com.thanhan.btchuong2.ex2.Notification;
import com.thanhan.btchuong2.ex2.NotificationFactory;

/**
 *
 * @author nguyenthanhan
 */
public class Btchuong2 {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        
        Notification sms = factory.createNotification("sms");
        sms.notifyUser();
        
        Notification email = factory.createNotification("email");
        email.notifyUser();
        
    }
}
