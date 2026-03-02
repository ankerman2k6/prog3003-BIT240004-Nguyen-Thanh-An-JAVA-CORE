package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("===== HỆ THỐNG XỬ LÝ THANH TOÁN (FACTORY METHOD) =====\n");

        try {
            // Khách hàng 1 chọn thanh toán Credit Card
            Payment payment1 = PaymentFactory.createPayment("creditcard");
            payment1.processPayment(250.50);

            // Khách hàng 2 chọn thanh toán PayPal
            Payment payment2 = PaymentFactory.createPayment("paypal");
            payment2.processPayment(99.99);

            // Khách hàng 3 chọn thanh toán Tiền mặt
            Payment payment3 = PaymentFactory.createPayment("cash");
            payment3.processPayment(15.00);

            // Thử nghiệm lỗi: Khách hàng nhập một phương thức không tồn tại
            System.out.println("Thử nghiệm phương thức không tồn tại:");
            Payment payment4 = PaymentFactory.createPayment("crypto");
            payment4.processPayment(500.00);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}