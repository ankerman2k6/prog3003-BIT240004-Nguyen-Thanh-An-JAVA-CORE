/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nguyenthanhan
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        NumberThread t1 = new NumberThread();
        NumberThread t2 = new NumberThread();
        NumberThread t3 = new NumberThread();
        NumberThread t4 = new NumberThread();
        NumberThread t5 = new NumberThread();
    
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t4.setName("Thread4");
        t5.setName("Thread5");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        

        
        
        
        
    }
    
    
    
}
