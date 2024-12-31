
// Implement a program to generate combination of parentheses
import java.util.Scanner;


public class Parentheses {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         generate("",0,0,n);
    }

    private static void generate(String result, int o, int c, int n) {
        if(result.length()==n*2){
            System.out.print(result+" ");
            return;
        }
        if(n>o){
            generate(result+"(",o+1,c,n);
        }
        if(o>c){
            generate(result+")",o,c+1,n);
        }
    }
}
