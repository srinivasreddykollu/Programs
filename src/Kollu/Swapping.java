package Kollu;

public class Swapping {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c;
        System.out.println("Before swapping the values of a and b are "+a+ " "+b);
       /* c=a;
        a=b;
        b=c;*/
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the values of a and b are "+a +" "+b);
        }
    }
