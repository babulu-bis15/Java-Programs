import java.util.Scanner;

class A1q1{
    public static void main(String[] args) {
        double l = 5.0; 
        double b = 4.0; 
        double h = 3.0; 

        double vRec = l * b * h;
        double vCube = l * l * l;
        double aSquare = l * l;

        System.out.println("Volume of Rectangle " + vRec);
        System.out.println("Volume of Cube " + vCube);
        System.out.println("Area of Square " + aSquare);
    }
}