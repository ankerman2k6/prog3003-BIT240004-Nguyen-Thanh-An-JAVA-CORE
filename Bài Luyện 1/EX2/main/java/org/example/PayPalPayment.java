package org.example;

class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println(" Đang kết nối tới tài khoản PayPal. Số tiền: $" + amount);
        System.out.println("-> Giao dịch PayPal thành công!\n");
    }
}
