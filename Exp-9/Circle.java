class Shape{
static double pi=3.14;
double radius;
void getPerimeter(){
}
void getArea(){
}
}

class Circle extends Shape{
void getPerimeter(){
	System.out.println(2*pi*radius);
}
void getArea(){
	System.out.println(pi*radius*radius);
}
public static void main(String args[]){
Circle c=new Circle();
c.radius=2.5;
c.getPerimeter();
c.getArea();
}
}
