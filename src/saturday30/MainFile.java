package saturday30;

/*
	    // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
 */

public class MainFile {
    public static void main(String[] args) {
        BankAccount alex = new BankAccount("1234567890", 34.4, "Alex Smith", "email@mail.com", "234-567890");
//        alex.deposit(567.4);
//        alex.withdrawal(564.7);
        System.out.println(alex.getCustomerPhone());
    }
}
