class base
{
base()
{
System.out.println("base class constructer called");
}
}

 class Derive extends base
{
Derive()
{
System.out.println(" Derive class constructer called");
}
}

class Main
{
public static void main(String[]args)
{
Derive d = new Derive();

}
}

