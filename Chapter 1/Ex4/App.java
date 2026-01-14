import java.util.ArrayList;

public class App {
  
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.add(1, "Mango");

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("Banana")){
                list.set(i, "Grapes");
            }
        }

        System.out.println("Apple in list: " + list.contains("Apple"));
        System.out.println("Danh sách sau khi chỉnh sửa: ");
        for(String fruit : list){
            System.out.print(fruit + " ");
        }
        
        
        
    }
}
