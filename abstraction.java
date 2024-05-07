abstract class vehicle 
{
abstract void start();
{
 class car extend vehicle
{
void start();
{
System.out.println(" car start");
}
}
class  bus extend vehicle
{
void start();
{
System.out.println(" bus start");
}
public static void main(String[]args)
{

car ci=new car;
ci.start();
bus bi=new bus;
bi.start();
}
}

