import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int year;
year=sc.nextInt();
if(((year%400)==0)||((year%4)==0)&&((year%100)!=100)))
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a Leap year");
}
}
}
