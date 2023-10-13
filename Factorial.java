import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		System.out.println("Enter a num");
		Scanner sc=new Scanner(System.in);
		int n;
		int i;
		n=sc.nextInt();
		int fact=1;
		for(i=1;i<=n;i++)
		{
		fact=fact*i;
		}
		System.out.println(fact);
	}
}
