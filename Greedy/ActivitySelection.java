import java.io.*;
import java.util.Scanner;
import java.util.*;
class Activity implements Comparable
{
public int first,last;
public int getLast(){return last;}
public int compareTo(Object  a){
return last-((Activity)a).getLast();
}
}

public class ActivitySelection{
static int n;
static Scanner in=new Scanner(System.in);
public static void main(String s[]){
n=in.nextInt();
Activity[] a=new Activity[n];
for(int i=0;i<n;i++){
	a[i]=new Activity();
	a[i].first=in.nextInt();
	a[i].last=in.nextInt();
	
}
Arrays.sort(a);
System.out.println(a[0].first+ "->"+ a[0].last);
int f=a[0].last;
for(int i=1;i<n;i++){
	if(a[i].first>=f){
		System.out.println(a[i].first+"->"+a[i].last);
		f=a[i].last;	
}
		
}
}

}
