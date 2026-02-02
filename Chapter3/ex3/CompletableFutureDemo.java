/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

import java.util.Arrays;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
/**
 *
 * @author nguyenthanhan
 */
public class CompletableFutureDemo {
    public static void main(String[] args){
        System.out.println("Main Thread Start");
        
        CompletableFuture.supplyAsync(() -> {
            
            List<Integer> numbers;
            numbers = Arrays.asList(1, 2, 5, 3, 100, 7, 8, 9);
            System.out.println("B1: Đã tạo dữ liệu ban đầu: " + numbers);
            return numbers;
        })
        
        //Biến đổi kết quả
        .thenApply(numbers -> {
            List<Integer> oddNumbers = numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .sorted()
                    .collect(Collectors.toList());
            
            System.out.println("B2: Đã lọc số và sắp xếp");
            return oddNumbers;
        })
                
        .thenApply(oddNumbers ->{
            String stringFormat = "Kết quả là: "+ oddNumbers.toString();
            System.out.println("B3: Đã format chuỗi");
            return stringFormat;  
        })
                
        .thenAccept(stringFormat->{
            System.out.println("B4: then accept" + stringFormat);
        })
                
        
        .join();

                
    }
    
    
}
