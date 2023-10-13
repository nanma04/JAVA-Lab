class Prime
{
	public static void main(String args[])
	{
		int n=7;
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
