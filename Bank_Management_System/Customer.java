public class Customer {
    private String name;
    private String customerID;
    private Account account;

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        this.account = new Account(customerID);
    }

    public String getName() {
        return name;
    }


    public String getCustomerID() {
        return customerID;
    }

    public Account getAccount() {
        return account;
    }

    public void displayAccountDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }
}

