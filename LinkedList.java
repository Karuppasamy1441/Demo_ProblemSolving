class List{
    Node head;



    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }

    }

    public void insert(int d) {
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while (n.next !=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public void display(){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println(" ");
    }
    public int middle(){
        Node slow=head;
        Node fast=head;
        while(  fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public void reverse(){
        Node current=head;
        Node pre=null;
        while(current!=null){
           Node node=current.next;
            current.next=null;
            pre=current;
            current=node;

        }
        head=pre;

    }

}


public class LinkedList {
    public static void main(String[] args){
    List list=new List();

    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    list.insert(60);



    list.display();
    System.out.println(" ");
    
    System.out.println("Middle Number : "+list.middle());
        list.reverse();


    }
}
