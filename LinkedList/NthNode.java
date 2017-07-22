class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		next=null;
	}
}

public class NthNode{
	Node head=null;
	public  int node(int n){
		int count=0;
		Node temp=head;
		while(count<n&&temp!=null){
			temp=temp.next;
			count++;
		}
		return temp.data;
	}

	public void push(int data){
		Node t=new Node(data);
		t.neaxt=head;
		head=t;

	}
	public static void main(String s[]){
		NthNode list =new NthNode();
		list.push(2);list.push(3);list.push(4);list.push(5);
		System.out.println(list.node(3));
	}
}