

public class KnightTour{
static int n=8;
public static boolean issafe(int x,int y,int ans[][]){
return (x>=0&&x<n&&y>=0&&y<n&&ans[x][y]==-1);
}
public static void printsol(int ans[][]){
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
		
			System.out.print(ans[i][j]+" ");
	System.out.println();
}
}
public static void solve(){
int i,j;
int sol[][]=new int[8][8];
for(i=0;i<n;i++)
	for(j=0;j<n;j++)
		sol[i][j]=-1;
 int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
sol[0][0]=0;

if(solutil(0,0,1,sol,xMove,yMove))
	printsol(sol);
else 
	System.out.println("No solution exists");

}

public static boolean solutil(int x,int y,int pos,int sol[][],int xmov[],int ymov[]){

if(pos==n*n)
	return true;
int i,j, nextx,nexty;

for(i=0;i<n;i++)
	{
		nextx=x+xmov[i];nexty=y+ymov[i];
		if(issafe(nextx,nexty,sol)){
			sol[nextx][nexty]=pos;
			if(solutil(nextx,nexty,pos+1,sol,xmov,ymov))
				return true;
			else sol[nextx][nexty]=-1;
}
			
}
return false;

}
public static void main(String s[]){
solve();
}
}
