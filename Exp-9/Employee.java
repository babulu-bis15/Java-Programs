class Person{
String firstname;
String lastname;
String getFirstname(){
	return firstname;
}
String getLastname(){
	return lastname;
}
}
class Employee extends Person{
String jobtitle;
String empid;
String getEmployeeId(){
 return empid;
}
String getLastname(){
return lastname+"("+jobtitle+")";
}
String getEmployeeInfo() {
   return getFirstname() + " " + getLastname() + " - " + getEmployeeId();
 }
public static void main(String args[]){
Employee e=new Employee ();
e.empid="Emp101";
e.firstname="Rahul";
e.lastname="Kumar";
e.jobtitle="Software Architecture";
System.out.println(e.getEmployeeInfo());
}
}