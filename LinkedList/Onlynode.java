class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		next=null;
	}
}

public class Onlynode{
	Node head=null;
	
	public void delete(Node node){
		Node temp = node.next;
		try{
		node.data=temp.data;
		node.next =temp.next;
	}
	catch(Exception e){

	}
	}
	public void print(){
		Node temp=head;
		while(temp!=null){
			p(temp.data+"->");
			temp =temp.next;
		}
	}

	public void push(int data){
		Node t=new Node(data);
		t.next=head;
		head=t;

	}
	public static void main(String s[]){
		Onlynode list =new Onlynode();
		list.push(2);list.push(3);list.push(4);list.push(5);
		list.delete(list.head);
		list.print();
		
	}
	public void p(Object s){
		System.out.print(s.toString());
	}
}