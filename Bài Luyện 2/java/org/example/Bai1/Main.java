package org.example.Bai1;

import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("John");
        treeSet.add("Alice");
        treeSet.add("Jack");
        treeSet.add("Bob");

        System.out.println("Danh sách treeSet: "+ treeSet);

        System.out.println("Phần tử lớn nhất: " + treeSet.last());
        System.out.println("Phần tử nhỏ nhất: " + treeSet.first());
    }
}