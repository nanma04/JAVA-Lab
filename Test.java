abstract class Shape
{
abstract void numOfSides();
}

class Rectangle extends Shape
{
	void numOfSides()
	{
	System.out.println("Rectanlge has 4 sides");
	}
}

class Triangle extends Shape
{
	void numOfSides()
	{
	System.out.println("Triangle has 3 side");
	}
}

class Hexagon extends Shape
{
	void numOfSides()
	{
	System.out.println("Hexagon has 6 sides");
	}
}

class Test
{
public static void main(String args[])
	{
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	Hexagon h=new Hexagon();
	r.numOfSides();
	t.numOfSides();
	h.numOfSides();
	}

}
