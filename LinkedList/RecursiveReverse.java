class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class RecursiveReverse{
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
	public Node reverse(Node node){

		if(node==null)
			return;
		node.next=reverse(node.next);

	}
	
	public static void main(String s[]){
		RecursiveReverse list=new RecursiveReverse();
		list.push(5);list.push(4);list.push(2);list.push(1);
		list.print();
		list.p("\n");
		list.reverse(head);
		list.print();
	
	}
}