class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class RemoveDuplicates{
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
	public void delete(){
		Node temp=head;
		if(temp==null)return;
		while(temp.next!=null){p("d");
			if(temp.data==temp.next.data){
				temp.next=temp.next.next;
			}
			else
				temp=temp.next;
		}
	}
	public static void main(String s[]){
		RemoveDuplicates list=new RemoveDuplicates();
		list.push(1);list.push(1);list.push(2);list.push(3);list.push(4);list.push(5);list.push(5);
		list.print();
		list.p("after");
		list.delete();
		list.print();
	}
}