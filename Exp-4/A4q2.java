import java.util.Scanner;
 class A4q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 float values");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        int c=(int)((a-(int)a)*1000);
         int d=(int)((b-(int)b)*1000);
         System.out.println(c);
         System.out.println(d);
         if(c==d){
            System.out.println("Flaot value are equal");
         }
         else{
            System.out.println("Float value are not equal");
         }
         sc.close();

    }
}
