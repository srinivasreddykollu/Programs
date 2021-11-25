package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter an number:");
        int num=scan.nextInt();
        int r,sum=0;
        while(num!=0){
            r=num%10;
            sum=sum*10+r;
            num=num/10;
            System.out.println(num);
        }
        System.out.println(sum);
    }
}
