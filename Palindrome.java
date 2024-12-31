
//Develop a program to check if a string is a palindrome
import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter word to check palindrome :");
        String word=in.nextLine();
        String reverse="";
        for(int i=0;i<word.length();i++){
            reverse=word.charAt(i)+reverse;
        }
        if(word.equals(reverse)){
            System.out.println("Palindrome...");
        }else{
            System.out.println("Not Palindrome...");
        }
    }

}
