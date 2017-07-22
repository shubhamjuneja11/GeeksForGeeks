class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Detectloop{
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
	public int loop(){
		Node slow,fast;
		slow=fast=head;

		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow.data==fast.data)
				return 1;
		}
		return 0;
	}
	
	public static void main(String s[]){
		Detectloop list=new Detectloop();
		 list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);
         
        /*Create loop for testing */
        list.head.next.next.next.next = list.head;
		
		
		if(list.loop()==1)
			list.p("loop");
		else list.p("no loop");
		
	
	}
}