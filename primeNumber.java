public class primeNumber
{
public static void main(String args[])
{

int num=7,temp=0;
for(int i=2;i<=num-1;i++)
{
if(num%i==0)
{
temp=temp+1;
}
}
if(temp==0)
{
System.out.println("not prime number");
}
else
{

System.out.println("prime number");
}
}
}
