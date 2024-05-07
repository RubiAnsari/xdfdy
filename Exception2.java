import java.io.*;
class Exception2{
public static void main(String[]args)
{
int a=4;
int b=0;
try{
System.out.println(a/b);
}
catch(ArithmeticException e){
	System.out.println(e.toString());
}
}
}