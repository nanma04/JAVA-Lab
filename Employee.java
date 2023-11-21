import java.util.Scanner;
class Employee
{
	int eno;
	String empname;
	int phno;
	Employee(int eno,String empname,int phn)
	{
	this.eno=eno;
	this.empname=empname;
	this.phno=phno;
	}
	void display()
	{
	System.out.println(eno+","+empname+","+phno);
	}
}

class Prgrm
{
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	Employee e[]=new Employee[5];
	for(int i=0;i<5;i++)
	{
	int x =sc.nextInt();
	String y=sc.nextLine();
	int z=sc.nextInt();
	e[i]=new Employee(x,y,z);
	}

	for(int i=0;i<5;i++)
	{
	System.out.print("Details\t ");
	e[i].display();

	}


}
}

