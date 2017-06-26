public class GreaterNo
{
	public static void main(String args[])
	{
	int a0=Integer.parseInt(args[0]);
	int a1=Integer.parseInt(args[1]);
	int a2=Integer.parseInt(args[2]); //string ko integer me convert karne k lie ye particular statement use hota hai
		
	if(a0>a1)
	{
		if(a0>a2)	
		{
		System.out.println(a0 +" is greatest "+a1  +a2);	
		}
		else
		{
		System.out.println(a2 +" is greatest "+a0  +a1);
		}
	}
	else 
	{
		if (a1>a2)
		{
		System.out.println(a1 +" is greatest " +a0  +a2 );	
		}
		else
		{
		System.out.println(a2 +" is greatest " +a0  +a1);
		}
	}
		
}
} 