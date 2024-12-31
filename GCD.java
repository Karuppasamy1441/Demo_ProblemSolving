
//Implement a program to find the GCD of two numbers

import java.util.Scanner;

public class GCD {
    public  static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a=in.nextInt();
        System.out.println("Enter 2st Number :");
        int b= in.nextInt();
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a!=0){
            System.out.println("GCD is "+a);
        }
        else{
            System.out.println("GCD is "+b);
        }
    }
}
