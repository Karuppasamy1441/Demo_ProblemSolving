
//write a program to check if two string are anagram
import java.util.Scanner;

public class Anagrams {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.indexOf(b.charAt(i))!=-1){
                count++;
            }
        }
        if(count==a.length()){
            System.out.println("Anagram...");
        }else{
            System.out.println("Not Anagram...");
        }
    }
}
