import java.util.*;
public class pNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp=0;
int num = sc.nextInt();
System.out.println("enter the value of num");
for(int i=2;i<=num-1;i++)
{
if(num%i==0)
{
temp=temp+1;
}
}
if(temp==0)
{
System.out.println("prime number");
}
else
{
System.out.println("this is prime number");
}
}
}
