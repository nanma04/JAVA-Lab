 import java.util.Scanner;
class Fibanocci
{
	public static void main(String args[])
	{	System.out.println("Enter a num");
		Scanner sc =new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i;
		int firstTerm=0;
		int secTerm=1;
		for(i=1;i<=n;i++)
		{
			System.out.println(firstTerm+" ");
			int nextTerm = firstTerm+secTerm;
			firstTerm=secTerm;
			secTerm=nextTerm;
		}
	}
}
