import java.util.Scanner;
class Factor
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for( int i=1;i<=n;i++)
		{
		if(n%i==0)
		{
			System.out.println(i);
		}
		}
	}
}

