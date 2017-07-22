class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Sortedinsert{
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
	public void insert(int n){
		Node node=new Node(n);
		Node temp=head;
		if(head==null ||head.data>n)
		{
			node.next=head;
			head=node;
			return ;
		}
		while(temp.next!=null && temp.next.data<n)
			temp=temp.next;
		node.next=temp.next;
		temp.next=node;

	}
	
	public static void main(String s[]){
		Sortedinsert list=new Sortedinsert();
		list.push(5);list.push(4);list.push(2);list.push(1);
		list.print();
		list.p("\n");
		list.insert(3);
		list.print();
	
	}
}