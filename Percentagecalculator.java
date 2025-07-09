import java.util.Scanner;
public class Percentagecalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Enter marks in Subject 4: ");
        double subject4 = scanner.nextDouble();


        double totalMarks = subject1 + subject2 + subject3 + subject4;
        double maxMarks = 400;

        double percentage = (totalMarks / maxMarks) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
