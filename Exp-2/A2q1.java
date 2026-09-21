import java.lang.*;
class A2q1{
    public static void main(String[] args) {
        int num=111,sum=0,rem;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num/=10;
        }
        System.out.println("Sum ="+sum);
    }
}