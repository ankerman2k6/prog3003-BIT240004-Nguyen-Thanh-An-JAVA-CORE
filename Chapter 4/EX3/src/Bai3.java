import java.util.function.Predicate;

public class Bai3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 ==0;
        int num = 9;
        System.out.println("Số "+ num + " là số chẵn? " + isEven.test(num));
    }
}
