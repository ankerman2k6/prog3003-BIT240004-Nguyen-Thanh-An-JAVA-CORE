/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author nguyenthanhan
 */
public class NumberThread extends Thread{
    @Override 
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println(getName()+ "Đang chạy với i = "+ i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(getName() + "bị gián đoạn");
            }
        }
        System.out.println(getName()+ " Kết thúc");
        
        
        
    }
}
