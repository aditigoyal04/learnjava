public class If
{
	public static void main(String args[])
	{
	int input=Integer.parseInt(args[0]); //string ko integer me convert karne k lie ye particular statement use hota hai
	if(input%2==0)
	{
		System.out.println("no is even " +input);	
	}
	else
	{
		System.out.println("no is odd "+input);
	}
	
	}

}