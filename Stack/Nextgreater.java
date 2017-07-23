class Stack{
	int top=-1;
	int stack[]=new int[100];
	public void push(int x){
		if(top+1==100)
			return;
		else
		stack[++top]=x;
	}
	public int pop(){
		if(top==-1){
			return -1;
		}
		else 
		{
			return stack[top--];
			
		}

	}
	public boolean isEmpty(){
		if(top==-1)
			return true;
		else return false;
	}
}
public class Nextgreater{
	
	public void check(int a[]){
		Stack stack=new Stack();
		stack.push(a[0]);
		int next;
		for(int i=1;i<a.length;i++){
			 next=a[i];
			if(!stack.isEmpty()){
				int x=stack.pop();
				
				while(x<next){
					System.out.println(x+"->"+a[i]);
					if(stack.isEmpty())
						break;
					x=stack.pop();
				}
				if(next<x)
					stack.push(x);
			}
			stack.push(next);

		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop()+"-> -1");
		}
	}
	public static void main(String s[]){
		
		Nextgreater bp=new Nextgreater();
		int a[]={ 11, 13, 21, 3 };
		bp.check(a);

		
	}

}