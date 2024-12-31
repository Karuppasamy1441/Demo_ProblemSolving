import java.util.Scanner;

class Stack{
    final static int initial=8;
    private int a[];
    private int size;
    private int capacity;
    Stack(){
        a=new int[initial];
        size=0;
        capacity=initial;
    }
    public void push(int n){
        if(size==capacity){
            capacity *=2;
            a=java.util.Arrays.copyOf(a,capacity);
        }
        a[size++]=n;
    }
    public void display(){

        for(int i=0;i<size;i++){
            System.out.print(a[i]+"->"+i+" ");
        }
    }
    public int peek(){
        int n=size-1;
        return a[n];
    }
    public int pop(){
        size -=1;
        return a[size++];
    }
}
public class MyStack {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Stack stack=new Stack();
        while(true){
            System.out.println();
            System.out.println("1 .add Data");
            System.out.println("2 .display");
            System.out.println("3 .peek");
            System.out.println("4 .pop");
            System.out.println("5 .Exit");
            System.out.println("Enter : ");
            int n=in.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter the data :");
                    int data=in.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.display();
                    break;
                case 3:
                    System.out.println("top-> "+stack.peek());
                    break;
                case 4:
                    System.out.println("data pop is : "+stack.pop());
                    break;
                case 5:
                    System.exit(0);
            }
        }


    }
}
