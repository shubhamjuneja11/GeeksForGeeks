class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		next=null;
	}
}

public class LastNthNode{
	Node head=null;
	
	
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
	public int last(int n){
		Node t1,t2;
		t1=t2=head;
		int count=1;
		while(t2!=null&&count<n){
			t2=t2.next;
			count++;
		}
		while(t2.next!=null){
			t1=t1.next;
			t2=t2.next;
			
		}
		return t1.data;
	}
	public static void main(String s[]){
		LastNthNode list =new LastNthNode();
		list.push(2);list.push(3);list.push(4);list.push(5);
		
		list.print();
		list.p("\n");
		list.p(list.last(2));
		
	}
	public void p(Object s){
		System.out.print(s.toString());
	}
}