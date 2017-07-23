class Stack{
	int stack[];
	int top1,top2;
	int size;
	public Stack(int n){
		stack=new int[n];
		top1=-1;
		top2=n;
		size=n;
	}
	public void push1(int n){
		if(top2!=top1+1)
			stack[++top1]=n;

	}
	public void push2(int n){
		if(top1!=top2-1)
			stack[--top2]=n;
	}
	public int pop1(){
		if(top1!=-1)
			return stack[top1--];
		return -1;
	}
	public int pop2(){
		if(top2!=size)
			return stack[top2++];
		return -1;
	}
}
public class Twostack{
	public static void main(String s[]){
	Stack ts = new Stack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                           " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                         " stack2 is " + ts.pop2());

	}
}
