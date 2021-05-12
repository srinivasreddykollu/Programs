package Kollu;

public class Main {
    public static void main(String[] args){
    Account obj=new Account();//("20252456789",120.00,"kollu","srinivasreddykollu5@gmail.com","7661927477");
    obj.withdrawal(100.0);
    obj.deposit(50.0);
    obj.withdrawal(100.0);
    obj.deposit(51.0);
    obj.withdrawal(100.0);
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());
        System.out.println(obj.getCustomerName());


    }
}
