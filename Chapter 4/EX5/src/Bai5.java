import java.util.function.Consumer;
import java.util.function.Supplier;

public class Bai5 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> (int) (Math.random() * 100);

//        K trả về kiểu j void
        Consumer<Integer> print = n -> System.out.println("Số may mắn: "+ n);

        Integer luckyNumber = random.get();

        print.accept(luckyNumber);
    }
}
