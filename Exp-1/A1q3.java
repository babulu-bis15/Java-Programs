import java.util.*;

class A1q3 {
    public static void main(String args[]) {
        int a = 5, b = 4, temp;
        
        temp = b;
        b = a;
        a = temp;
        
        System.out.println("a = " + a + ", b = " + b);
    }
}