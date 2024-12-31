//write a program to find maximum and minimum of an array

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int Maximum=0 , Minimum=0;
        System.out.println("Enter size of Array :");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
        if(arr[0]>arr[1]){
           Maximum=arr[0];
           Minimum=arr[1];
        }
        else{
            Maximum=arr[1];
            Minimum=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>Maximum){
                Maximum=arr[i];
            }
            if(arr[i]<Minimum){
                Minimum=arr[i];
            }
        }
        System.out.println("Maximum Number :"+Maximum);
        System.out.println("Minimum Number :"+Minimum);
    }
}
