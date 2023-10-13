import java.util.*;
class Madd
{
public static void main(String args[])
{
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the row size");
	int a=num.nextInt();
	System.out.println("Enetr coloumn size");
	int b=num.nextInt();
	int x [][];
	int y [][];
	int z [][];
	x=new int[a][b];
	y=new int[a][b];
	z=new int [a][b];


	System.out.println("Enetr elements for x");
	for(int i=0;i<a;i++)
	{
	for(int j=0;j<b;j++)
		{
		x[i][j]=num.nextInt();
		}
	}
	System.out.println("Enetr elements for y");
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{
		y[i][j]=num.nextInt();
		}
	}
	for(int i=0;i<a;i++)
	{
	for(int j=0;j<b;j++)
		{
		z[i][j]=x[i][j]+y[i][j];
		}
	}
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{
		System.out.println("z:"+ z[i][j]);
		}
	}

}
}
