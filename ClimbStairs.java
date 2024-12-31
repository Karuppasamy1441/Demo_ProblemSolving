
//Create a program to find the number of ways to climb stairs(n steps)
import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number of stairs : ");
        int n=in.nextInt();
        int first=1;
        int initial=1;
        int total=0;
        for(int i=2;i<=n;i++){
            total=initial+first;
            initial=first;
            first=total;
        }
        System.out.println("Number of ways to climb stairs is "+total);
    }
}
