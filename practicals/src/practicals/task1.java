
package practicals;
import java.util.*;

public class task1 {
	public static void main(String[] args) 
	{
	rectangle r=new rectangle();
	r.printarea();
	 triangle t=new triangle();
	 t.printarea();
	circle r1=new circle();
	r1.printarea();
	}
}
	abstract class shape
	{
	 int a,b;
	 abstract public void printarea();
	}
	class rectangle extends shape
	{
	public int area_rect;
	public void printarea()
	{
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the length and breadth of rectangle");
	  a=s.nextInt();
	  b=s.nextInt();
	  area_rect=a*b;
	  System.out.println("Length of rectangle "+ a +"breadth of rectangle \n"+b );	
	  System.out.println("The area ofrectangle is:\n"+ area_rect );
	 }
	 }
	class triangle extends shape
	{
	 double area_tri;
	 public void printarea()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the base and height of triangle\n");
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("Base of triangle "+ a +"height of triangle \n"+b );
	area_tri=(0.5*a*b);
	System.out.println("The area of triangle is:\n"+area_tri );
	}
	}
	class circle extends shape
	{
	double area_circle;
	public void printarea()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius of circle\n");
	a=s.nextInt();
	 area_circle=(3.14*a*a);
	 System.out.println("Radius of circle\n"+ a );
	 System.out.println("The area of circle is:\n" + area_circle);
	}
	}

