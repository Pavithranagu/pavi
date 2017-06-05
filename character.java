import java.io.*;
import java.util.*;
public class character
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char aa=s.next().charAt(0);
if((aa>='a' && aa<='z' )||(aa>='A' && aa<='Z'))
{
System.out.print("Alphabet");
}
else
{
System.out.print("not a Alphabet");
}
}}
