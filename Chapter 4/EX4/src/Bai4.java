
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Bai4 {
    public static void main(String[] args) {

        List<String> current = Arrays.asList("$10", "$20" , "$50");
        Function<String, Integer> parseNum = s -> Integer.parseInt(s.replace("$", ""));

        List<Integer> numbers = new ArrayList<>();

        for(String str : current){
            Integer number= parseNum.apply(str);
            numbers.add(number);
        }

        System.out.println("Danh sách chuỗi ban đầu: " + current);
        System.out.println("Danh sách số nguyên sau chuyển đổi: " + numbers);


    }
}
