import java.util.*;

class small {
    
  
	public static void main (String[] args) {
	   Scanner in=new Scanner(System.in);
	   long   nn=in.nextLong();
	   String n=String.valueOf(nn);
	   int k=in.nextInt();

	   StringBuilder val=new StringBuilder(n);
	   val.deleteCharAt(k-1);
	   System.out.println(val.toString());
	   
	   
	}
}
