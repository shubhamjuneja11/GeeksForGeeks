class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Reversegroup{
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
	public Node reverse(Node head,int k){
		Node prev=null,cur=head,next=null;
		int count=0;
		while(cur!=null&&count<k){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;
		}
		if(next!=null)
			prev.next=reverse(next,k);
		return prev;

	}
	public static void main(String s[]){
		Reversegroup list=new Reversegroup();
		list.push(1);list.push(3);list.push(2);list.push(3);list.push(4);list.push(5);list.push(4);
		list.print();
		list.p("\n");
		list.reverse(list.head,2);
		list.print();
	
	}
}