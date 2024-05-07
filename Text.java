class Test {

void showMe(){

System.out.println("Hello Everyone");
}
}
class Xyz extends Test
{
	
 void show(){
System.out.println("Hi");
}
}
class Main{
public static void main(String [] args)
{  

Xyz ob=new Xyz();
ob.show();
ob.showMe();

}
}


