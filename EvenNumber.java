
//Create a program to generate the first n evan number
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter nth value :");
        int n=in.nextInt();
        System.out.println("nth value even number :");
        for(int i=1;i<=n;i++){
            System.out.println(i*2);
        }
    }
}
