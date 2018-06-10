import java.util.*;
class Unique {
	public static void main (String[] args) {
	    Scanner in=new Scanner (System.in);
	    int n,i,val;
	    n=in.nextInt();
      if(n>=1&&n<=100000){
	    Set<Integer>s=new HashSet<>();
	    Set<Integer> u=new TreeSet<>();
	    for(i=0;i<n;i++)
	    { val=in.nextInt();
	        if(s.contains(val))
	       u.add(val);
	        else
	        s.add(val);
	    }
	    for(int h:u)
	   System.out.println(h);
	    } }
}
