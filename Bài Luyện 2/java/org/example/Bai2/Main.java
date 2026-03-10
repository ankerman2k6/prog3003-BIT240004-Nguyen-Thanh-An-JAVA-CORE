package org.example.Bai2;

public class Main {
    public static void main(String[] args) {
        Computer PC1 = new Computer.ComputerBuilder("256GB", "16GB").setBluetoothEnabled(false).build();
        Computer PC2 = new Computer.ComputerBuilder("128GB", "32GB").setBluetoothEnabled(true).build();

        System.out.println(PC2);
        System.out.println(PC1);
    }
}
