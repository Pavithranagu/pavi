import java.io.*;
import java.util.*;
public class alp
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char n=s.next().charAt(0);
 if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
{
System.out.print("vowel");
}
else
{
System.out.print("constant");
}
}}
