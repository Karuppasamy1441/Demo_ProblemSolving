
//Implement a program to find all permutation of a string
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String word= in.nextLine();
        permutation(word,"");
    }

    private static void permutation(String word, String result) {
        if(word.isEmpty()){
            System.out.println(result);
            return;
        }
        for(int i=0;i<word.length();i++){
            char f=word.charAt(i);
            String remaining=word.substring(0,i)+word.substring(i+1);
            permutation(remaining,result+f);
        }
    }


}
