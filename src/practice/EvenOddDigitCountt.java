package practice;

public class EvenOddDigitCountt {
    public static void main(String[] args){
        int num=789456;
        int ecount = 0,ocount=0;
        while(num>0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                ecount++;
            } else {
                ocount++;
            }
            num=num/10;

        }
        System.out.println("the count of even number is "+ecount +" \nthe count of odd digits id "+ocount);
    }
}
