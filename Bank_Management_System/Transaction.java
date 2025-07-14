import java.text.DecimalFormat;
import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        DecimalFormat df = new DecimalFormat("#,###.00");

        Customer customer1 = new Customer("Foyez", "C001");
        Customer customer2 = new Customer("Ahmed", "C002");

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("\nAccount Details of Customer 1:");
                    customer1.displayAccountDetails();
                    System.out.println("\nAccount Details of Customer 2:");
                    customer2.displayAccountDetails();
                    break;


                case 2:
                    System.out.print("\nEnter the customer (1 for Foyez, 2 for Ahmed): ");
                    int depositChoice = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositChoice == 1) {
                        customer1.getAccount().deposit(depositAmount);
                        System.out.println("Deposited: " + df.format(depositAmount));
                    } else if (depositChoice == 2) {
                        customer2.getAccount().deposit(depositAmount);
                        System.out.println("Deposited: " + df.format(depositAmount));
                    } else {
                        System.out.println("Invalid customer choice.");
                    }
                    break;


                case 3:
                    System.out.print("\nEnter the customer (1 for Foyez, 2 for Ahmed): ");
                    int withdrawChoice = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawChoice == 1) {
                        customer1.getAccount().withdraw(withdrawAmount);
                        System.out.println("Withdrawn: " + df.format(withdrawAmount));
                    } else if (withdrawChoice == 2) {
                        customer2.getAccount().withdraw(withdrawAmount);
                        System.out.println("Withdrawn: " + df.format(withdrawAmount));
                    } else {
                        System.out.println("Invalid customer choice.");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter the sender customer (1 for Foyez, 2 for Ahmed): ");
                    int transferSenderChoice = scanner.nextInt();
                    System.out.print("Enter the receiver customer (1 for Foyez, 2 for Ahmed): ");
                    int transferReceiverChoice = scanner.nextInt();
                    System.out.print("Enter transfer amount: ");

                    double transferAmount = scanner.nextDouble();
                    if (transferSenderChoice == 1 && transferReceiverChoice == 2) {
                        customer1.getAccount().transfer(customer2.getAccount(), transferAmount);
                        System.out.println("Transferred: " + df.format(transferAmount) + " to Account: " + customer2.getAccount().getAccountNumber());
                    } else if (transferSenderChoice == 2 && transferReceiverChoice == 1) {
                        customer2.getAccount().transfer(customer1.getAccount(), transferAmount);
                        System.out.println("Transferred: " + df.format(transferAmount) + " to Account: " + customer1.getAccount().getAccountNumber());
                    } else {
                        System.out.println("Invalid customer choice.");
                    }
                    break;

                case 5:

                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}

