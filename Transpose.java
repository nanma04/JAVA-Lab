import java.util.*;
class Transpose
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
	x=new int[a][b];
	y=new int[b][a];
	


	System.out.println("Enetr elements for x");
	for(int i=0;i<a;i++)
	{
	for(int j=0;j<b;j++)
		{
		x[i][j]=num.nextInt();
		}
	}	
	for(int i=0;i<a;i++)
	{
	for(int j=0;j<b;j++)
		{
		y[j][i]=x[i][j];
		}
	}
		System.out.println("y is:");

	for(int i=0;i<b;i++)
	{
		for(int j=0;j<a;j++)
		{
		System.out.println(y[i][j]);
		}
	}

}
}
