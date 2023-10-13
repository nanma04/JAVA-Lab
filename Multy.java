import java.util.*;
class Multy
{
public static void main(String args[])
{
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the row size");
	int a=num.nextInt();
	System.out.println("Enetr coloumn size");
	int b=num.nextInt();
System.out.println("Enter the row size of y");
	int p=num.nextInt();
	System.out.println("Enter coloumn size for y");
	int q=num.nextInt();




	int x [][];
	int y [][];
	int z [][];
	x=new int[a][b];
	y=new int[p][q];
	z=new int [a][b];

	
	
	System.out.println("Enetr elements for x");
	for(int i=0;i<a;i++)
		{
		for(int j=0;j<b;j++)
			{
			x[i][j]=num.nextInt();
			}
		}

		
	
	if(b!=p)
	System.out.println("It cannot be performed");

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
			for(int j=0;j<q;j++)
			{
				for(int k=0;k<b;k++)
				{
				z[i][j]=x[i][k]*y[k][j];
				}
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
