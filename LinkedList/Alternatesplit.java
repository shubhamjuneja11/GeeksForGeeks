class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Alternatesplit{
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
	public void split(Alternatesplit l1,Alternatesplit l2){
		Node temp=head;
		while(temp!=null){
			l1.push(temp.data);
			if(temp.next!=null)
				{
					temp=temp.next;
					l2.push(temp.data);

				}	
			temp=temp.next;
		}
	}
	public static void main(String s[]){
		Alternatesplit list=new Alternatesplit();
		Alternatesplit  l1,l2;
		l1=new Alternatesplit();
		l2=new Alternatesplit();
		list.push(1);list.push(2);list.push(3);list.push(4);list.push(5);list.push(6);list.push(7);
		list.split(l1,l2);
		l1.print();
		l1.p("\n");
		l2.print();
		
	
	}
}