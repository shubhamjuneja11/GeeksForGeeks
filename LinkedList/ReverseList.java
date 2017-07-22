class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class ReverseList{
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
	public void reverse(){
		Node prev,current,next;
		prev=null;
		current=head;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;

		}
		head=prev;
		
	}
	public static void main(String s[]){
		ReverseList list=new ReverseList();
		list.push(1);list.push(1);list.push(2);list.push(3);list.push(4);list.push(5);list.push(5);
		list.print();
		list.reverse();
		list.print();
	
	}
}