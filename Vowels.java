import java.io.*;
import java.util.*;
public class Vowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Char c;
c=sc.next().charAt(0);
if((('a'=='a')||('a'=='e')||('a'=='i')||('a'=='o')||('a'=='u'))&&(('A'=='A')||('A'=='E')||('A'=='I')||('A'=='O')||('A'=='U')))
{
System.out.println("Given character is Vowel");
}
else
{
System.out.println("Given chracter is Consonant");
}
}
}
