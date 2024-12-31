
//Write a program to reverse a string
import java.util.Scanner;

public class StringReverse {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word to reverse :");
        String str=in.nextLine();
        String reverse="";
        for(int i=0;i<str.length();i++){
            reverse=str.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
