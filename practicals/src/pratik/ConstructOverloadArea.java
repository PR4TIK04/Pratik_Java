package pratik;
import java.util.*;

public class ConstructOverloadArea 
{
	ConstructOverloadArea(int s)
	{
		float area= s*s;
		System.out.println("\nAREA OF SQUARE:"+area);
	}
	ConstructOverloadArea(int l,int b)
	{
		float area= l*b;
		System.out.println("\nAREA OF RECTANGLE:"+area);
	}
	public static void main(String args[])
	{
	int side,length,breadth;
	Scanner sc = new Scanner(System.in);
	System.out.println("\nENTER SIDE OF SQUARE,LENGTH AND BREADTH OF RECTANGLE:");
	side = sc.nextInt();
	length = sc.nextInt();
	breadth = sc.nextInt();
	ConstructOverloadArea s1 = new ConstructOverloadArea(side);
	ConstructOverloadArea s2 = new ConstructOverloadArea(length,breadth);
	}

}
