public class Main {
    public static void main(String[] args) {
        MathOperation plus = (a,b) -> a + b;
        MathOperation minus = (a,b) -> a - b;
        MathOperation multiply = (a,b) -> a * b;
        MathOperation divide = (a,b) -> a % b;

//        Lambda Expression
        System.out.println(plus.compute(4, 10));
        System.out.println(minus.compute(4, 10));
        System.out.println(multiply.compute(4, 10));
        System.out.println(divide.compute(4, 10));



    }
}