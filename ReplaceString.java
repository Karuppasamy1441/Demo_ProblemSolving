
//Write a program to replace all space ina string with "%20"
import java.util.Scanner;

public class ReplaceString {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String word=in.nextLine();

        String changed=word.replace(" ","%20");
        System.out.println("Replaced : "+changed);
    }
}
