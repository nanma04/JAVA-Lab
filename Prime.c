class Prime
{
	public static void main(String args[])
	{
	int n=7;
	flag=0;
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
	System.out.println(n+"is odd");
	}
	else
	{
	System.out.println("is not");
	}
}


