package saturday30;

public class BankAccount {

    //laukai arba kintamieji;
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(){
        this("0000000", 00.0, "Tom Black", "mail@mail.com", "00-000000");
        System.out.println("Tuscias konstruktorius.");
    }

    //konstruktorius
    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Saskaitos informacija:");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    //sukuriam nauja metoda aprasyti saskaitos deposita.
    public void deposit(double depositAmount){//'deposit' vardas sukurtas aprasyti metoda. 'depositAmount' parameter;
        this.balance = this.balance + depositAmount;// 'this.balance' keicia 'this.balance+depositAmount'.
        System.out.println("Jusu suma " + depositAmount + "eu saskaitoje. Naujas balansas: " + this.balance + "eu.");
    }

    public void withdrawal(double withdrawalAmount){
        // sukuriame statement if else kad patikrintu ar uztenka pinigu ismokejimui;
        if(this.balance - withdrawalAmount <= 0){
            System.out.println("Jusu saskaitoje: " + this.balance + "eu. Negalime isduoti pinigu.");
        }
        else{
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Jusu pinigu suma " + withdrawalAmount + "eu. isgryninama. Jusu saskaitoje liko " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
