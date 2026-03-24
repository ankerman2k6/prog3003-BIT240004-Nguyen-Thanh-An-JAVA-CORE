package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;
        MathOperation div = (a, b) ->{
            if(b == 0){
                System.out.println("Không chia hết cho 0");
                return 0;
            }
            return a / b;
        };

        int x = 1;
        int y = 9;
        System.out.println("Phép công: "+ x + " + " + y + " = " + add.compute(x, y));
        System.out.println( "Phép trừ: "+ x + " - " + y + " = " +sub.compute(x, y));
        System.out.println("Phép nhân: "+ x + " * " + y + " = " + mul.compute(x, y));
        System.out.println( "Phép chia: "+ x + " / " +y + " = " + div.compute(x, y));
    }
}