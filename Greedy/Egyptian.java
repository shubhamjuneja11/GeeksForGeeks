import java.util.Scanner;
import static java.lang.System.out;
public class Egyptian {

public static void egypt(int n,int d){
if(n==0 || d==0)
	out.println("not posible");
else if(n%d==0)
	out.println(n/d);
else if(d%n==0)
	out.println("1/"+(d/n));
else if(n%d==0)
	{
		out.println(n%d+" + ");
		egypt(n%d,d);
	}
else{
	int x=d/n+1;
	out.println("1/"+x+" + ");
	egypt(n*x-d,d*x);
}
}
public static void main (String s[]){
int n,d;
Scanner in=new Scanner(System.in);
n=in.nextInt();
d=in.nextInt();
egypt(n,d);
	


}
}
