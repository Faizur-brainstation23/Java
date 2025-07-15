import java.util.ArrayList;
import java.util.Collections;

public class Sort_array_list {


        public static void main(String[] args) {
            ArrayList<String> fruits = new ArrayList<String>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Watermelon");
            fruits.add("Mango");
            fruits.add("Pineapple");
            Collections.sort(fruits);

            for (String i : fruits) {
                System.out.println(i);
            }
        }
    }


