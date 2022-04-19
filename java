import java.io.*;
import java.util.*;
class sumofdigits
{
public static void main(String args[])
{
int n;
int sum;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
sum=n*(n+1)/2;
System.out.println(sum);
}
}
