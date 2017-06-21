import java.util.Scanner;
class target{
    public static void main(String args[]){
        int a[]=new int[4];
        int i,j,target,t=0,temp=0,g=0;
        Scanner in=new Scanner(System.in);
        for(i=0;i<4;i++)
            a[i]=in.nextInt();
        target=in.nextInt();
        for(i=0;i<4;i++)
        { 
            j=i+1;
            if(j<4){
    
            t=a[i]+a[j];
              if(t==target){
                  g=1;
            System.out.println( "possible values are:"+a[i]+" "+a[j]);}
        }
        }
         if(g==0)
              System.out.println("No possible values are present");
    
       
    }
}
