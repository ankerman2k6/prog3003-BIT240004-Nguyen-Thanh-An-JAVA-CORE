package org.example;

class PaymentFactory {
// Phương thức này nhận vào loại thanh toán và trả về đúng đối tượng tương ứng
public static Payment createPayment(String paymentType) {
    if (paymentType == null || paymentType.isEmpty()) {
        return null;
    }

    // Dựa vào chuỗi truyền vào để quyết định tạo đối tượng nào
    switch (paymentType.toLowerCase()) {
        case "creditcard":
            return new CreditCardPayment();
        case "paypal":
            return new PayPalPayment();
        case "cash":
            return new CashPayment();
        default:
            throw new IllegalArgumentException("Lỗi: Không hỗ trợ phương thức thanh toán - " + paymentType);
    }
}
}
