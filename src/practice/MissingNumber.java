package practice;

public class MissingNumber {
    public static void main(String[] args){
        //no need to be sorted and no duplicates
        int[] arr={1,2,5,3};
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
        }
        System.out.println(sum);
    }
}
