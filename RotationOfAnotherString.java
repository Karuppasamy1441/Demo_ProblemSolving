
//create a program to check if a string is a rotation os another string
import java.util.Scanner;

public class RotationOfAnotherString {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input-1:");
        String s1=in.next();
        System.out.println("Enter the input-2");
        String s2=in.next();
        String join=s1+s1;
        if(s1.length()==s2.length()){
            if(join.contains(s2)){
                System.out.println("String-2 is rotation of string-1");
            }
            else{
                System.out.println("Not Rotated");
            }
        }
        else{
            System.out.println("Not Rotated");
        }

    }
}
