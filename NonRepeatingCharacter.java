
//Implement a program to find the first non-repeating character in a string

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word=in.next();
        for(int i=0;i<word.length();i++){
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
                System.out.println("Non Repeating Character : '"+word.charAt(i)+"'");
            }
        }
    }
}
