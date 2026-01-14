import java.util.HashMap;


public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Anna");
        map.put(102, "Peter");
        map.put(103, "Mary");

        System.out.println("Nhân viên có mã 102: " + map.get(102));

        System.out.println("ID 105 có tồn tại không? " + map.containsKey(105));
        if(map.containsKey(105) == false){
            map.put(105, "unknown");
        }

        System.out.println("Danh sách nhân viên: " + map);
    }
}
