

class ArrayList<T>{
    private static int intial=8;
    private int size;
    private T a[];
    private int capacity;
 public  ArrayList(){
     size=0;
     a=(T[]) new Object[intial];
     capacity=intial;
 }
 public void add(T n){
     if(size==capacity) {
         capacity *=2;
         a = java.util.Arrays.copyOf(a,capacity);
     }
     a[size++]=n;
 }
 public void display(){
     for(int i=0;i<size;i++){
         System.out.print(a[i]+" ");
     }
 }

 public void remove(int r){
     for(int i=r;i<size;i++){
         a[i]=a[i+1];
     }
     size--;
 }
 public void insert(int pos,T val){
     for(int i=size;i>=pos;i--){
         a[i+1]=a[i];
     }
     a[pos]=val;
     size++;
 }
}


public class Demo {
    public static  void main(String[] args){
        ArrayList<Integer> list =new ArrayList<Integer>();
        ArrayList<String> list1 =new ArrayList<String>();
        list1.add("ram");
        list1.add("surya");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list1.display();
        System.out.println();
        list.insert(1,11);
        list.display();
    }
}
