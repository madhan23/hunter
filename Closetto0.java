import java.util.Scanner;
import java.util.Arrays;
class Closetto0{
    public static void main(String a[]){
        int a1[],i,j,c=0,s1,s2;
        Scanner in=new Scanner(System.in);
        s1=in.nextInt();
        a1=new int[s1];
     for(i=0;i<s1;i++)
        a1[i]=in.nextInt();
        
            for(i=0;i<s1;i++)
            {
            for(j=i+1;j<s1;j++)
            {
                if(a1[i]+a1[j]==0)
                {
                    System.out.println(" values that closet to zero:"+a1[i]+" "+a1[j]);
                }
            }
            }
        
    }}
           
     
        
 
