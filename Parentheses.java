import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
//        String check=in.nextLine();
//        validParenthesis(check);
        int n=in.nextInt();
        List<String> genarate=generateParatheses(n);
        System.out.print(genarate);
    }
    private static List<String> generateParatheses(int n) {
        List<String> para=new ArrayList<>();
        helper(para,"",0,0,n);
        return para;
    }
    private static void helper(List<String> para, String temp, int open, int close, int n) {

        if(temp.length()==n*2){
            para.add(temp);
            return;
        }
        if(open<n){
            helper(para,temp+'(',open+1,close,n);
        }
        if(close<open){
            helper(para,temp+')',open,close+1,n);
        }

    }



    private static void validParenthesis(String check) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<check.length();i++){

            char c=check.charAt(i);
            if(c =='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if (c==')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();
            }
            else if (c==']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }   else if (c=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            }
        }
        System.out.print(stack.isEmpty());
    }
}
