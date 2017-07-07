import java.io.*;
import java.util.*;
public class Large
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((c<b)&&(b<a))
{
System.out.println(a);
}
else if((c<a)&&(a<b))
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}
