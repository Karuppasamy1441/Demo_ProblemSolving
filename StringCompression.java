
//Create a program to perform string compression

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input : ");
        String w=in.next();
        int count=1;
        String result="";
        for(int i=1;i<w.length();i++){
            if(w.charAt(i)==w.charAt(i-1)){
                count++;
            }else{
                result=result+w.charAt(i-1)+count;
                count=1;
            }
        }
        result=result+w.charAt(w.length()-1)+count;
        System.out.println("OUTPUT : "+result);
    }
}
