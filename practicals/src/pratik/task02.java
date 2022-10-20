package pratik;

import java.util.Scanner; 

public class task02 {
	public static void main(String[] args) 
	{ 
		Area a = new Area();
		Perimeter p = new Perimeter();
		a.print_cal();
		p.print_cal();
	}
}
interface Rectangle
{
	void print_cal();
	Scanner sc = new Scanner(System.in);

}
class Area implements Rectangle
{
public float l,w;
public float area;
public void print_cal()
{
System.out.printf("\nENTER LENGTH AND WIDTH:");
l = sc.nextFloat();
w = sc.nextFloat();
area = l*w;
System.out.printf("\nArea of rectangle with length %.2f and width %.2f is%.2f",l,w,area);
}
}
class Perimeter implements Rectangle
{
public float l,w;
public float area;
public void print_cal()
{
System.out.printf("\nENTER LENGTH AND WIDTH:");
l = sc.nextFloat();
w = sc.nextFloat();
float v = l*w;
area =2*v;
System.out.printf("\nPerimeter of rectangle with length %.2f and width %.2f is%.2f",l,w,area);
}
}
