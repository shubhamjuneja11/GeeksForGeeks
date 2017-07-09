public class Nqueen{
static int n=4;
public static boolean issafe(int x,int y,int a[][] ){
int i,j;
for(i=0;i<=y-1;i++)
	if(a[x][i]==1)
		return false;
for(i=x,j=y;i>=0&&j>=0;i--, j--)
{
	if(a[i][j]==1)
		return false;
}
for(i=x,j=y;i<n&&j>=0;i++, j--)
{
	if(a[i][j]==1)		return false;
}
return true;
}

public static void solve(){
 int a[][] = {{0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
if(solveutil(a,0,n))
	printsol(a,n);
else System.out.println("no sol exist");

}
public static void printsol(int a[][],int n){
for(int i=0;i<n;i++)
	{

	for(int j=0;j<n;j++)
		System.out.print(a[i][j]+"  ");
	System.out.println();
}

}

public static boolean solveutil(int a[][],int c,int n){

if(c>=n)
return true;

for(int i=0;i<n;i++){
	if(issafe(i,c,a))
		{
			a[i][c]=1;
			if (solveutil(a,c+1,n))
				return true;
			a[i][c]=0;
}

}
return false;
}
public static void main(String s[]){
solve();
}
}

