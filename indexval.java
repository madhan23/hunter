import java.util.*;
class Indexval{
public static void main (String[] args) {
Scanner in=new Scanner (System.in);
int n,i,val[],c=1;
n=in.nextInt();
val=new int[n];
if(n>=1&&n<=100000){
    for(i=0;i<n;i++){
    val[i]=in.nextInt();
  if(i==val[i]){
      c=0;
System.out.print(i+" "); }
}if(c!=0)
	    System.out.println("-1");
	}
}
}
