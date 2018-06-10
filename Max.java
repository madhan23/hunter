{
public static void main (String[] args) {
Scanner in=new Scanner (System.in);
int n,i,val[];
n=in.nextInt();
val=new int[n];
if(n>=1&&n<=100000){
    for(i=0;i<n;i++)
    val[i]=in.nextInt();
    Arrays.sort(val);
    for(i=val.length-1;i>=0;i--)
System.out.print(val[i]);
	}
}
}
