class p1{
int a;
}
class p2 extends p1{
int b;
}
class child extends p2{
void input(){
a=5;
b=10;
}
}
class D extends child{
void sum(){
System.out.println(a+b);
}
}
class Q5{
public static void main(String args[]){
D obj=new D();
obj.input();
obj.sum();
}
}