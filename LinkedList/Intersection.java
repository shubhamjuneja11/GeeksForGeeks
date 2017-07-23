class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class Intersection{
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
	public Intersection intersect(Node t1,Node t2){
		Intersection list=new Intersection();
		while(t1!=null&&t2!=null){
			if(t1.data==t2.data){
				list.push(t1.data);
				t1=t1.next;
				t2=t2.next;
			}
			else if(t1.data<t2.data)
				t2=t2.next;
			else t1=t1.next;
		}
		return list;
	}
	public static void main(String s[]){
		Intersection list=new Intersection();
		list.push(1);list.push(2);list.push(3);list.push(4);list.push(5);list.push(6);list.push(7);
		Intersection list2=new Intersection();
		list2.push(1);list2.push(3);list2.push(5);list2.push(7);list2.push(8);list2.push(9);
		list.p("\n");
		//list.print();
		Intersection li=list.intersect(list.head,list2.head);
		li.print();
	
	}
}