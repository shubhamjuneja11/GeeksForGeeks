import java.util.HashSet;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Removeduplicate{
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
	public void remove(){
		HashSet<Integer> hash=new HashSet();
		Node temp=head;
		Node prev=null;
		while(temp!=null){
			if(hash.contains(temp.data))
			{
				prev.next=temp.next;
			}
			else{
				hash.add(temp.data);
				prev=temp;
			}
			temp=temp.next;
		}
	}
	public static void main(String s[]){
		Removeduplicate list=new Removeduplicate();
		list.push(1);list.push(3);list.push(2);list.push(3);list.push(4);list.push(5);list.push(4);
		list.print();
		list.p("\n");
		list.remove();
		list.print();
	
	}
}