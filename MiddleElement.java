

// Write a program to find the middle element of a linked list

class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void insert(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void display(){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public int middle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
        }

        return slow.data;
    }

}
public class MiddleElement {
    public static void main(String[]args){

        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        System.out.println();
        System.out.print("Middle element : "+list.middle());
    }
}
