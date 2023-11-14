import java.util.Scanner;
class Perimeter
{	
	Perimeter(double r)
	{
	  double x=2*3.14*r;
	  System.out.println("Circle:"+x);
	}
	Perimeter(int l,int b)
	{
	
	 float y=2*(l+b);
	 System.out.println("Rectangle"+y);
	}

}
class Shapes
{
	public static void main(String args[])
	{
		Perimeter p1=new Perimeter(5.0);
		Perimeter p2=new Perimeter(5,5);
	}
}
