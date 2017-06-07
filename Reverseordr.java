import java.util.Scanner;
import java.util.Arrays;
class Reverseordr{
    public static void main(String args[]){
        String s;
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        StringBuilder ss=new StringBuilder(s);
     ss=ss.reverse();
     String f=new String(ss);
     char x[]=f.toCharArray();
     Arrays.sort(x);
     String rst=new String(x);
System.out.println(rst);} }
