public class RatPuzzle{
static int n=4;
public static void printsol(int sol[][]){
int i,j;
for(i=0;i<n;i++){
	for(j=0;j<n;j++)
		System.out.print(sol[i][j]);
System.out.println();
}
}

public static boolean issafe(int x,int y,int a[][]){
return (x>=0&&y>=0&&x<n&&y<n&&a[x][y]==1);
}
public static void solve(int a[][]){
int sol[][] = { {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };

if(solveutil(0,0,sol,a))
	printsol(sol);
else System.out.println("no solution");

}
public static boolean solveutil(int x,int y,int sol[][],int maze[][]){

if(x==n-1&&y==n-1)
{sol[x][y]=1;	return true;}
if(issafe(x,y,maze))
	{

		sol[x][y]=1;
		if(solveutil(x+1,y,sol,maze))
			return true;
		if(solveutil(x,y+1,sol,maze))
			return true;
		sol[x][y]=0;	
}

return false;


}

public static void main(String s[]){
	 int maze[][] = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
	solve(maze);

}
}
