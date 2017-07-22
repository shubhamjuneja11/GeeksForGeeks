import java.util.HashSet;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Pairswap{
    Node head;
    public void push(int d){
        Node node=new Node(d);
        node.data=d;
        node.next=head;
        head=node;
    }
    public void p(Object a){
        System.out.print(a.toString());
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            p(temp.data+"->");
            temp=temp.next;
        }
    }
    public void swap(){
        Node temp=head;
        while(temp.next!=null){
            int t=temp.data;
            temp.data=temp.next.data;
            temp.next.data=t;
            temp=temp.next.next;
        }
    }
    public static void main(String s[]){
        Pairswap list=new Pairswap();
        list.push(1);list.push(2);list.push(3);list.push(4);list.push(5);list.push(6);list.push(7);
        list.print();
        list.p("\n");
        list.swap();
        list.print();
    
    }
}