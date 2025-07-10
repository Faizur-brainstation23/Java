import java.util.*;
public class Loops{
    public static void main(String[] args){
       // for (int i = 0;i<50; i++){
        // System.out.println("Assalamu walaikum");

        /*
        int i = 0;
         while (i< 15) {
           System.out.println(i);
           i = i + 1 ;
              */
     /* int i = 0;
      do {
          System.out.println(i);
          i = i + 1;
      } while (i < 20);
     */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);




        }
    }


