import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("John");
        treeSet.add("Alice");
        treeSet.add("Zack");
        treeSet.add("Charlie");

        System.out.println("TreeSet: " + treeSet);

        System.out.println("Phần tử đầu tiên: " + treeSet.first());
        System.out.println("Phần tử cuối cùng: " + treeSet.last());
    }
}
