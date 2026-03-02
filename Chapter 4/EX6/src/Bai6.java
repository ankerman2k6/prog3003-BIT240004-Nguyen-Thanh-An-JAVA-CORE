import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Bai6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        int result = numbers.stream()
                .filter(n -> n% 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("DS ban đầu: "+ numbers);
        System.out.printf("Tổng Bình phương các số chẵn: "+ result);


    }
}
