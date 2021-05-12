package Kollu;

public class Account {
    private String accountNumber;
    private double balance;
    private String CustomerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        CustomerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(){
    this("12345",500.0,"thiru","jhdsgjhedga@gmaol.com","9581098480");
    System.out.println("empty constructor is called");
}
public Account(String accountNumber,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
    System.out.println("this constructor is called");
   this.accountNumber=accountNumber;
    this.balance=balance;
    this.customerPhoneNumber=customerPhoneNumber;
    this.customerEmailAddress=customerEmailAddress;
    this.CustomerName=customerName;
}
public void deposit(double depositAmount){
    this.balance+=depositAmount;
    System.out.println("Deposit of "+depositAmount+"made.New balance is "+this.balance);
}
public void withdrawal(double withdrawAmount) {
    if (this.balance - withdrawAmount <= 0) {
        System.out.println("only " + this.balance + " available. withdrawal is not processed ");
    } else {
        this.balance -= withdrawAmount;
        System.out.println("withdrawal amount " + withdrawAmount + "processed .Remainig balance" + this.balance);
    }
}
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}


