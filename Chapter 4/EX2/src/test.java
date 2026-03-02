import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        Collections.sort(cities, (a, b) -> a.length() - b.length());

        System.out.print(cities);
    }
}
