import java.util.Scanner;
class E3q1 {
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 subject marks");
int s1 = sc.nextInt();
int s2 = sc.nextInt();
int s3 = sc.nextInt();
int s4 = sc.nextInt();
int s5 =sc.nextInt();
int total = s1+s2+s3+54+s5;
double percentage = total/5.0;
System.out.println("Total = "+total);
System.out.println("Percentage = "+percentage);
}
}