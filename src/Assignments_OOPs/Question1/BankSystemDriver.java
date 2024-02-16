package Assignments_OOPs.Question1;

class BankSystem {
    private String accNumber;
    private double balance;

    private double AadharNo;
    private String accHolderName;

    private String panNo;

    public BankSystem(String accNumber, double Balance, String Name,String panno,double adharno) {
        this.accNumber = accNumber;
        this.balance = Balance;
        this.accHolderName = Name;
        this.AadharNo = adharno;
        this.panNo = panno;
    }


    public void getAccNumber() {
        System.out.println("Account Number: " + accNumber);
    }
    public void getBalance() {
        System.out.println("Available Balance: " + balance);
    }
    public void getAccHolderName() {
        System.out.println("Account Holder Name: " + accHolderName);
    }


    public void credit(double amount) {
        balance += amount;
    }
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Low  balance !!!");
        }
    }
}

public class BankSystemDriver {
    public static void main(String[] args) {
        BankSystem acc = new BankSystem("1234", 105478, "AMITABH BACHHAN","2345fc342",23452452);

        acc.getAccNumber();
        acc.getAccHolderName();
        acc.getBalance();

        System.out.println("CREDIT");
        acc.credit(2344);
        acc.getBalance();

        System.out.println("DEBIT");
        acc.debit(3928);
        acc.getBalance();
    }
}