public class reverseNumber
{
public static void main(String args[])
{
System.out.println("enter the value");
Scanner sc=new Scanner(Syatem.in);
int num=sc.nextInt();
int rev=0,rem;
while(num!=0)
{
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println(rev);
}
}