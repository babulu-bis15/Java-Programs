import java.util.Scanner;
class E3q5{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter CP");
double cp = sc.nextDouble();
System.out.println("Enter SP");
double sp = sc.nextDouble();
if (sp>cp){
double p = sp-cp;
double per = (p*100)/cp;
System. out.println("Profit = "+p);
System.out.println("Percentage = "+per);
} else if(cp>sp){
double l =cp-sp;
double per = (1*100)/cp;
System.out.println("Loss= "+l);
System.out.println("Percentage = "+per);
} else {
System.out.println("No Profit No Loss");
}
}
}