import java.util.Scanner;

class A1q4 {
    public static void main(String args[]) {
        int a = 30, b = 20;
        
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println(" a = " + a + ", b = " + b);
    }
}