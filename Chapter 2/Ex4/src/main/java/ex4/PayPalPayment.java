package ex4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nguyenthanhan
 */
public class PayPalPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Đã thanh toán bằng Paypal với số tiền " + amount );
    }
    
}
