/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author nguyenthanhan
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    
    public void checkOut(int amount){
        if(paymentStrategy == null){
            System.out.println("Chưa chọn phương thức");
        }
        
        paymentStrategy.pay(amount);
    }
}
