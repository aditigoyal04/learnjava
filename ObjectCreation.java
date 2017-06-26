public class ObjectCreation
{
	public static void main(String args[])
	{
	YouCanCreateMyObject objectCreated; //reference created
	objectCreated=new YouCanCreateMyObject(); //object created
	objectCreated.sum(19,11);

	int ans=objectCreated.mul(2,5);
	System.out.println(ans);
	}
}

class YouCanCreateMyObject
{
	void sum(int a,int b)
	{
	System.out.println(a+b);
	}
	
	int mul(int c,int d)
	{
	return(c*d);	
	}
}