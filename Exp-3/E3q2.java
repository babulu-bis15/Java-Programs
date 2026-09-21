import java.util.Scanner;
class E3q2 {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Basic salary");
double basic = sc.nextDouble();
double hra = basic*0.10;
double da = basic*0.60;
double gs = basic + hra + da;
System.out.println("HRA = "+hra);
System.out.println("DA ="+da);
System.out.println("Gross salary ="+gs);

}
}