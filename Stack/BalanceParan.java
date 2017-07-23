class Stack{
	int top=-1;
	char stack[]=new char[100];
	public void push(char x){
		if(top+1==100)
			return;
		else
		stack[++top]=x;
	}
	public char pop(){
		if(top==-1){
			return '-';
		}
		else 
		{
			return stack[top--];
			
		}
	}
}
public class BalanceParan{
	Stack stack;
	public boolean check(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
				stack.push(s.charAt(i));
			else {
				char c=stack.pop();
				char d=s.charAt(i);
				if(!(c=='{'&&d=='}'||c=='['&&d==']'||c=='('&&d==')'))
					return false;
			}

		}
		return true;
	}
	public static void main(String s[]){
		
		BalanceParan bp=new BalanceParan();
		bp.stack=new Stack();
		String so="{[(}]}";

		if(bp.check(so))
			System.out.println("balanced");
		else System.out.println("not");
	}

}