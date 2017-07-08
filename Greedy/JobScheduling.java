import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class JobScheduling{
public static void main(String s[]){
Job j[];
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
j=new Job[n];
int result[]=new int[n];
for(int i=0;i<n;i++){
	j[i]=new Job();
	j[i].id=in.nextInt();
	j[i].d=in.nextInt();
	j[i].profit=in.nextInt();
}
Arrays.sort(j);
boolean slot[]=new boolean[n];
for(int i=0;i<n;i++){
for(int jo=Math.min(n,j[i].d)-1;jo>=0;jo--){
	if(slot[jo]==false){

	slot[jo]=true;
	result[jo]=i+1;
	break;

}
}
}
for(int i=0;i<n;i++)
if(slot[i])
	out.println(result[i]);
}
}
class Job implements Comparable{
public int d,profit,id;
public int compareTo(Object o){
return (((Job)o).profit)-profit;
}
}
