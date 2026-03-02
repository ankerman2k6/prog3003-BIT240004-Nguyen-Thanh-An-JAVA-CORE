package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        System.out.println("===== HỆ THỐNG GIAO DỊCH NGÂN HÀNG BẤT ĐỒNG BỘ =====\n");

        // Giao dịch 1: Hợp lệ và thành công
        System.out.println("-> Bắt đầu Giao dịch 1 (Hợp lệ)...");
        processTransaction("USER_OK", 500.0);

        // Giao dịch 2: Lỗi xác thực
        System.out.println("\n-> Bắt đầu Giao dịch 2 (Sai thông tin)...");
        processTransaction("USER_INVALID", 500.0);

        // Giao dịch 3: Lỗi số dư
        System.out.println("\n-> Bắt đầu Giao dịch 3 (Không đủ tiền)...");
        processTransaction("USER_OK", 50000.0);

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n===== KẾT THÚC CHƯƠNG TRÌNH =====");
    }

    // --- Phương thức xây dựng đường ống giao dịch ---
    static void processTransaction(String userId, double amount) {
        CompletableFuture.supplyAsync(() -> authenticate(userId))

                .thenApply(authOk -> checkBalance(userId, amount))

                .thenApply(balanceOk -> transferFunds(userId, amount))

                .exceptionally(ex -> {
                    return " Giao dịch bị huỷ: " + ex.getCause().getMessage();
                })
                // Cuối cùng, in kết quả (thành công hoặc lỗi) ra màn hình
                .thenAccept(result -> System.out.println(result));
    }

    // --- Các phương thức mô phỏng tác vụ (có độ trễ) ---

    // 1. Xác thực khách hàng
    static boolean authenticate(String userId) {
        sleep(1000);
        if ("USER_INVALID".equals(userId)) {
            throw new RuntimeException("Xác thực thất bại! Khách hàng không tồn tại.");
        }
        System.out.println(" [✔] Xác thực thành công cho: " + userId);
        return true;
    }

    // 2. Kiểm tra số dư
    static boolean checkBalance(String userId, double amount) {
        sleep(1500);
        double currentBalance = 10000.0; // Giả sử số dư luôn là 10,000
        if (amount > currentBalance) {
            throw new RuntimeException("Số dư không đủ! (Cần: " + amount + ", Hiện có: " + currentBalance + ")");
        }
        System.out.println(" [✔] Kiểm tra số dư thành công. Số tiền hợp lệ: " + amount);
        return true;
    }

    // 3. Thực hiện chuyển tiền
    static String transferFunds(String userId, double amount) {
        sleep(2000);
        System.out.println(" [✔] Đang thực hiện chuyển " + amount + " từ tài khoản " + userId + "...");
        return "GIAO DỊCH HOÀN TẤT THÀNH CÔNG: Đã chuyển $" + amount + "!";
    }


    static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}