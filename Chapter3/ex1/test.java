/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhan.btchuong3.ex1;

/**
 *
 * @author nguyenthanhan
 */
public class test {
    public static void main(String[] args) {
        WorkerThread thread = new WorkerThread();
        WorkerRunnable runnable = new WorkerRunnable();
        
        thread.start();
        runnable.run();
    }
}
