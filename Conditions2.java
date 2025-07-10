import java.util.*;
public class Conditions2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* int age = sc.nextInt();

         */

       /* int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Equal");
        }
        else if (a>b){
                System.out.println("a is greater");
            }
        else {
                System.out.println("a is lesser");
            }
        }
        /*
        */
     /*   if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

      */

       int button = sc.nextInt();
//
//        if (button == 1) {
//            System.out.println("Assalamu walaikum");
//        } else if (button == 2) {
//            System.out.println("Hello");
//        } else if  (button == 3) {
//            System.out.println("Konnichiwa");
//        } else {
//            System.out.println("Invalid Button");
//        }

        switch(button){
            case 1 : System.out.println("Assalamu walaikum");
                break;
            case 2 :
                System.out.println("Hello");
                break;
            case 3 :
                System.out.println("Konnichiwa");
                break;
            default :
                System.out.println("Invalid Button");

        }
    }
}

