package org.example;

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println(" Đang xử lý thanh toán qua Credit Card. Số tiền: $" + amount);
        System.out.println("-> Giao dịch Credit Card thành công!\n");
    }
}