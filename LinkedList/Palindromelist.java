class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Palindromelist{
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
	public Node middle(){
		Node t1,t2;
		t1=t2=head;
		int count=1;
		while(t2!=null&&t2.next!=null){
			t2=t2.next.next;
			t1=t1.next;
			count++;
		}
		if(t1!=null)
		return t1;
		else return null;
	}

	public int palindrome(){
		Node mid=middle();
		Node midpoint=reverse(mid);
		Node temp=head;
		Node storemid=midpoint;
		while(midpoint!=null){
			if(temp.data!=midpoint.data)
				{	reverse(storemid);
					return 0;
				}
			temp=temp.next;
			midpoint=midpoint.next;

		}
		reverse(storemid);
		return 1;

	}
	public Node reverse(Node head){
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
		return head;
	}
	
	public static void main(String s[]){
		Palindromelist list=new Palindromelist();
		 list.push(1);
        list.push(2);
        list.push(3);
        list.push(1);
         list.print();
         list.p("\n");
        if(list.palindrome()==1)
        	list.p("palindrome");
        else list.p("not palindrome");
	
	}
}