package arrays;

public class PrintFiveCitiesOfArray {
    public static void main(String[] args){
        String[] string=new String[5];
        int[] arr ={2,5,4,8,1};
        add(arr);
        System.out.println(string);//prints the reference of the object
        string[1]="kadaparthy";
        string[2]="nakrekal";
        string[0]="hyderabad";
        for(int i=0;i<string.length;i++){
            System.out.println(string[i]);

        }
    }//passing array values bto array
    public static void add(int[] arr){
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];

        }
        System.out.println(sum);


    }
}
