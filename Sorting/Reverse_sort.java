import java.util.ArrayList;
import java.util.Collections;

public class Reverse_sort {

        public static void main (String[] args){
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(18);
            numbers.add(57);
            numbers.add(94);
            numbers.add(34);
            numbers.add(54);

            Collections.sort(numbers,Collections.reverseOrder());
            for (int i : numbers){
                System.out.println(i);
            }
        }
    }

