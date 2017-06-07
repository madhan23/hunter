import java.util.Scanner;
import java.util.Arrays;
class Subset{
    public static void main(String a[]){
        int a1[],a2[],i,j,c=0,s1,s2;
        Scanner in=new Scanner(System.in);
        s1=in.nextInt();
        s2=in.nextInt();
        a1=new int[s1];
        a2=new int[s2];
        for(i=0;i<s1;i++)
        a1[i]=in.nextInt();
        for(i=0;i<s2;i++)
        a2[i]=in.nextInt();
        Arrays.sort(a1);
        Arrays.sort(a2);
            for(i=0;i<s1;i++)
            {
            for(j=0;j<s2;j++)
            {
                if(a1[i]==a2[j])
                {
                    c++;
                    break;
                }
            }
            }
            if(c==s1)
                System.out.println("a1 is Subsetof a2");
                else 
                System.out.println("a1 is NotSubsetof a2");
            }
        
        
    }
