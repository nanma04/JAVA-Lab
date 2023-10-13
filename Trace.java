import java.util.*;
class Trace
{
public static void main(String args[])
{
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the row size");
	int a=num.nextInt();
	System.out.println("Enetr coloumn size");
	int b=num.nextInt();
	int x [][];
	int sum=0;
	x=new int[a][b];
	


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
		if(i==j)
			{
			sum=sum+x[i][i];
			}
		}
	}
		

	
		System.out.println(sum);
		

}
}
