public class Cal
{
	public static void main(String args[])
	{
	int d=Integer.parseInt(args[0]);
	int m=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]); //string ko integer me convert karne k lie ye particular statement use hota hai
		if(y%4==0)
		{
			if(m==01)
			{
			for(d=1;d<=31;d++)
				{
				System.out.println(+d +m +y);
				}
			}
			if(m==04)
			{
			for(d=1;d<=30;d++)
				{
				System.out.println(+d +m +y);
				}
			}
			if(m==02)
			{
			for(d=1;d<=29;d++)
				{
				System.out.println(+d +m +y);
				}
			}
		}

		else if(!(y%4==0))
		{
			if(m==01) 
			{
			for(d=1;d<=31;d++)
				{
				System.out.println(+d +m +y);
				}
			}
			if(m==04)
			{
			for(d=1;d<=30;d++)
				{
				System.out.println(+d +m +y);
				}
			}
			if(m==02)
			{
			for(d=1;d<=28;d++)
				{
				System.out.println(+d +m +y);
				}
			}
		}
	}
}	



/*
j=31
f=28/29
march=31
april=30
may=31
june=30
july=31
august=31
september=30
october=31
november=30
december=31




if(a0>a1)
	{
		if(a0>a2)	
		{
		System.out.println(a0 +" is greatest ");	
		}
		else
		{
		System.out.println(a2 +" is greatest ");
		}
	}
	else 
	{
		if (a1>a2)
		{
		System.out.println(a1 +" is greatest ");	
		}
		else
		{
		System.out.println(a2 +" is greatest ");
		}
	}
		
}} */