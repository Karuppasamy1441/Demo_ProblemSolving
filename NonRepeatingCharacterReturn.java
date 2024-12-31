
// Given a string s,find the first non-repeating character in it and return its index.
// If iit does not exist,return -1

import java.util.Scanner;

public class NonRepeatingCharacterReturn {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int n = nonRepeatingCharacter(s);
        System.out.print(n);
    }

    private static int nonRepeatingCharacter(String s) {

        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
