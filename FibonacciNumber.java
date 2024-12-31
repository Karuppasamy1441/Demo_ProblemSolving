
//Write a recursive program to calculate Fibonacci Number
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number of series: ");
        int n=in.nextInt();
        fibonacci(n,0,1,0+1);

    }

    private static void fibonacci(int n, int n1, int n2, int sum) {
        if(n==0){
            return;
        }
        System.out.print(n1+" ");
        sum=n1+n2;
        n1=n2;
        n2=sum;
        fibonacci(n-1,n1,n2,sum);
    }


}
