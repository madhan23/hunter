import java.util.Scanner;
class size
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int i,j,k,t,d,b[],temp=0;
       int a[]={1,2,3,4,5,6,7};
       b=new int[a.length];
     d=in.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==d)
            { k=0;
            temp=i;
            for(t=i+1;t<a.length;t++)
            {
                b[k]=a[t];
             
                k++;
            }
            for(j=0;j<=temp;j++)
            {
                b[k]=a[j];
                   
                k++;
            }
                
            }
        }
        for(int u:b) 
         System.out.print(u+" ");
       }
}
       
       
        
    
        
       
