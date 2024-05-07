import java.util.Scanner;
public class decimal
{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);

int decimal_num = sc.nextInt();
int ans = 0;
int pw =1;

while(decimal_num >0){

int perity = decimal_num %2;
ans +=(perity*pw);
decimal_num/=2;
}
System.out.println(ans);
}
}