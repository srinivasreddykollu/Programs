package Kollu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args){
        int[] arr={1,90,50,5,3};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("array after sorting is : " + Arrays.toString(arr));

        }

    }
