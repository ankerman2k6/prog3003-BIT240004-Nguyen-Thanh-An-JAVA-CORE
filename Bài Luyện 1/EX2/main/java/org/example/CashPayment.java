package org.example;

class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("💵 Khách hàng chọn thanh toán bằng Tiền mặt khi nhận hàng (COD). Số tiền cần thu: $" + amount);
        System.out.println("-> Đã ghi nhận đơn hàng thanh toán tiền mặt!\n");
    }
}
