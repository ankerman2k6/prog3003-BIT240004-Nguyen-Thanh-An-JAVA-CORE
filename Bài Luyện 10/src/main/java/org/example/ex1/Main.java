package org.example.ex1;

import java.util.HashMap;

public class Main
{
    public static void main(String[] args) {
        HashMap<Integer, String> staff = new HashMap<>();
        staff.put(101, "Anna");
        staff.put(102, "Peter");
        staff.put(103, "Mary");

        System.out.println("Nhân viên có ID bằng 102: "+ staff.get(102));

        boolean k = false;
        for(int i : staff.keySet()){
            if(i == 105){
                k = true;
            }
        }
        if(k == false){
            staff.put(105, "Unknown");
        }

        System.out.println("Hash map nhân viên: "+ staff.toString());
    }
}
