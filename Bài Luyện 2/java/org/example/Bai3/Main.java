package org.example.Bai3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        System.out.println("---- HỆ THỐNG ĐẶT VÉ XEM PHIM -----");

        CompletableFuture<String> authTask = CompletableFuture.supplyAsync(() -> {
            System.out.println("Xác thực khách hàng (" + Thread.currentThread().getName() + ")");
            sleep(1500);
            System.out.println("Hoàn Thành Xác thực!");
            return "Hợp lệ";
        });

        CompletableFuture<String> ticketTask = CompletableFuture.supplyAsync(() -> {
            System.out.println("Chuẩn bị vé (" + Thread.currentThread().getName() + ")");
            sleep(2000);
            System.out.println("Đã chuẩn bị!");
            return "Vé Thỏ Ơi (Ghế VIP)";
        });

        CompletableFuture<String> combinedTask = authTask.thenCombine(ticketTask, (authResult, ticketResult) -> {
            return "Kết quả: " + authResult + " | Đã cấp: " + ticketResult;
        });

        try {
            String finalResult = combinedTask.get();
            System.out.println("Hoàn thành giao dịch!");
            System.out.println(finalResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
