import java.util.Scanner;
 class A4q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month(1-12)");
        int m=sc.nextInt();
        System.out.println("enter the year");
        int y=sc.nextInt();
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                   System.out.println("31 Days");
                      break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 Days");
                      break;
            case 2:
                if((y%400==0)||(y%4==0 && y%100!=0)){
                    System.out.println("29 Days");
                }
                else{
                    System.out.println("28 Days");
                }
                break;
                default:
                    System.out.println("Invalid month");
        }
        sc.close();
        
    }
}
