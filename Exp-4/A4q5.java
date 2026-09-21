import java.util.Scanner;
 class A4q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");
        }
        else if(ch>='a'&&ch<='z'||ch>='A'&& ch<='Z'){
            System.out.println("Consonent");
        }
        else{
            System.out.println("Invalid value");
        }
        sc.close();

    }
}
