class Node{
	int data;
	Node next;
	Node(int d){
		this.data=d;
		next=null;
	}
}

public class MiddleList{
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
	public int middle(){
		Node t1,t2;
		t1=t2=head;
		int count=1;
		while(t2!=null&&t2.next!=null){
			t2=t2.next.next;
			t1=t1.next;
			count++;
		}
		if(t1!=null)
		return t1.data;
		else return -1;
	}
	public static void main(String s[]){
		MiddleList list =new MiddleList();
		
		list.push(2);list.push(3);list.push(4);list.push(5);
		list.print();
		list.p("\n");
		list.p(list.middle());
		
	}
	public void p(Object s){
		System.out.print(s.toString());
	}
}