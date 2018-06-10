import java.util.*;
class Uniq
{
public static void main (String[] args) {
Scanner in=new Scanner (System.in);
int n,i,val[],j,c=0;
n=in.nextInt();
val=new int[n];
if(n>=1&&n<=100000){
    for(i=0;i<n;i++)
    val[i]=in.nextInt();
    for(i=0;i<n;i++){
        c=0;
        for(j=0;j<n;j++){
            if(j!=i){
               if(val[i]==val[j])
               c=1;
            }
        }
        if(c!=1)
        System.out.print(val[i]);
    }
}
}
}
