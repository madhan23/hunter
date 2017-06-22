import java.util.Scanner;
class substring
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s1;
        String s2;
        int i,j,k,h,co=0,val,g=0,pos=0;
        s1=in.nextLine();
        s2=in.nextLine();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        val=c2.length;
    for(i=0;i<c2.length;i++)
    {
        for(j=0;j<c1.length;j++)
        {
            if(c2[i]==c1[j])
            {
                co++;
                pos=j-1;
                for(k=i+1,h=j+1;(k<c2.length)&&(h<c1.length);k++,h++)
                {
                    if(c2[k]==c1[h])
                    {
                        co++;
                        if(co==val)
                        {
                            g=1;
                            break;
                        }
                    }
                    
                }
                
            }
        }
    
        }
    if(g==1)
    System.out.print(pos);
    else
    System.out.print("-1");
}
}
