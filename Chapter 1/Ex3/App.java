public class App {
  
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("MSSV", 10170);
        Pair<String, String> pair2 = new OrderedPair<>("HoTen", "Nguyen Thi Hoa");

        System.out.println("Khoá: " + pair.getKey() + ", Giá trị: " + pair.getValue());
        System.out.println("Khoá: " + pair2.getKey() + ", Giá trị: " + pair2.getValue());
        
    }
}
