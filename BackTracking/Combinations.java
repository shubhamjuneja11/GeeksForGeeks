import java.util.Vector;
public class Combinations{
public static void solve(int n){
	Vector<Integer> v=new Vector();
	for(int i=0;i<2*n;i++)
		v.add(-1);
	findsol(v,1,n);
}
public static void findsol(Vector<Integer>a, int e,int n){
	if(e>n)
	{
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		return;
	}
	for(int i=0;i<2*n;i++){
		if(a.get(i)==-1&&i+e+1<2*n&&a.get(i+e+1	)==-1){
			a.set(i,e);
			a.set(i+e+1,e);
			findsol(a,e+1,n);
			a.set(i,-1);
			a.set(i+e+1,-1);
		}

	}

}
public static void main(String s[]){
	solve(3);
}
}