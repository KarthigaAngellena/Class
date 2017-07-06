# Class
import java.io.*;
import java.util.*;
public class Posit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
a=sc.nextInt();
if(a>0)
{
System.out.println("Given Number is Positive");
}
else if(a<0)
{
System.out.println("Given Number is Negative");
}
else
{
System.out.println("Given Number is Zero");
}
}
}
