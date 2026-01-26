/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thanhan.btchuong2;


import ex4.CreditCardPayment;
import ex4.PayPalPayment;
import ex4.ShoppingCart;

/**
 *
 * @author nguyenthanhan
 */
public class Btchuong2 {
    public static void main(String[] args) {
        ShoppingCart sp = new ShoppingCart();
        int amount = 50000;
        //Thanh toán bằng credit card
        sp.setPaymentStrategy(new CreditCardPayment());
        sp.checkOut(amount);
        
        //sau đó lại thanh toán bằng paypal
        sp.setPaymentStrategy(new PayPalPayment());
        sp.checkOut(amount);
        
    }

}
