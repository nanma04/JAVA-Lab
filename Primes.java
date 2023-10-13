import java.util.Scanner;
class Primes
{
	public static void main(String args[])
	{
		{
		System.out.println("Enter a num");
		Scanner sc =new Scanner(System.in);
		int n;
		n = sc.nextInt();
		 int flag=0;
		int i;
		for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}
			}
		if(flag==0)
			{
			System.out.println(n+"is prime");
			}
			else
			{
			System.out.println("is not");
			}
		}
	}
	
	
}
