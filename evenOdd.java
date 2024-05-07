import java.util.Scanner;

class evenOdd
{
public static void main(String[]args)
{
int num ;
Scanner number = new Scanner(System.in);
System.out.println("enter the number");
num = number.nextInt();

if( num%2 == 0)
{
System.out.println("num is even");
}
else
{
System.out.println("num is odd");
}
}
}
