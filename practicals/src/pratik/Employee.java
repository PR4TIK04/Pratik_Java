package pratik;

public class Employee 
{
String name;
int id;
float salary;
Employee(String n,int i,float s)
{
name = n;
id = i;
salary = s;
}
void display()
{
 System.out.println("\nEmployee Name:"+name);	
 System.out.println("\nEmployee ID:"+id);	
 System.out.println("\nEmployee Salary:"+salary);	
}
public static void main(String args[])
{
Employee E = new Employee("Raju",345,150);
E.display();
}
}