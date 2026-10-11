interface A{
default void show(){
System.out.println("This is A interface");
}
}
interface B{
default void show(){
System.out.println("This is B interface");
}
}
class C implements A,B{
public void show(){
A.super.show();
B.super.show();
}
}
public class Q2{
public static void main(String args[]){
C obj=new C();
obj.show();
}
}