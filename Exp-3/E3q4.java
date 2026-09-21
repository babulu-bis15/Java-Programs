import java.util.Scanner;
class E3q4{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int x = sc.nextInt();
if(x>0)
 System.out.println("Positive");

else if(x<0)
 System.out.println("Negative");

else
 System.out.println("Zero");
}
}