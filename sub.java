import java.util.Scanner;
class sub
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1;
    int len,i,j;
         s1=in.nextLine();
        len=in.nextInt();
       String a=s1.substring(0,len);
      System.out.println(a);
       char x[]=s1.toCharArray();
       for(i=len;i<x.length;i++)
       {
           for(j=0;j<len-1;j++)
           {
             System.out.print(x[j]);  
               
           }
         System.out.println(x[i]);
       }
       
       
        
    }
}
        
       
