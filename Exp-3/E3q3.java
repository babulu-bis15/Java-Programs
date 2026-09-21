import java.util.Scanner;
class E3q3 {
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter Previous Reading");
int prev = sc.nextInt();
System.out.println("Enter Current Reading");
int cur= sc.nextInt();
int units = cur- prev;
int bill;
if(units <=100) {
bill = units*3;
}
else if (units <=500){
 bill =(100*3)+((units-100)*4);
}
else{
 bill = (100*3)+(400*4)+((units-500)*6);
}
System.out.println("Units = "+units);
System.out.println("Bill = "+bill);
}
}