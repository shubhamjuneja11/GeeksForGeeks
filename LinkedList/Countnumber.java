class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Countnumber{
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
	public int count(int n){
		Node temp=head;
		int count=0;
		while(temp!=null){
			if(temp.data==n)
				count++;
			temp=temp.next;
		}
		return count;
	}
	public static void main(String s[]){
		Countnumber list=new Countnumber();
		list.push(1);list.push(1);list.push(2);list.push(3);list.push(4);list.push(5);list.push(5);
		
		list.p(list.count(5));
	
	}
}