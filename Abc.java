class Employee
{
	void display()
	{
	System.out.println("The name of the class is employee");
	}
	void calcSalary()
	{
	System.out.println("Salary of Employee : 10,000");
	}
}
class Engineer extends Employee
{
	void display()
	{
	 super.display();
	}
	void calcSalary()
	{
	super.calcSalary();
	System.out.println("Salary of Enginner : 20000");
	}
}

class Abc
{
	public static void main(String args[])
	{
	Engineer a =new Engineer();
	a.display();
	a.calcSalary();
	}
}


