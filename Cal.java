public class Cal
{
	public static void main(String args[])
	{
	int d1=0,m1=0,y1=0;
	int d=Integer.parseInt(args[0]);
	int m=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]); //string ko integer me convert karne k lie ye particular statement use hota hai
	
	if(m==1 || m==3 || m==5 || m==7)
	{
		if(d>=1 || d<=30)
		{d1=d+1;
		System.out.println(d1+ " " +m+" " +y);}
		else if(d==31)
		{d1=1;
		m1= m+1;
		System.out.println(d1+ " " +m1+" " +y);}
	}
/*	if(m==5 || m==7)
	{
		if(d>=1 || d<=30)
		{d1=d+1;
		System.out.println(d1+ " " +m+" " +y);}
		else if(d==31)
		{d1=1;
		m1=m+1;
		System.out.println(d1+ " " +m1+" " +y);}
	}
*/
	if(m==8 || m==10)
	{
		if(d>=1 || d<=30)
		{d1=d+1;
		System.out.println(d1+ " " +m+" " +y);}
		else if(d==31)
		{d1=1;
		m1=m+1;
		System.out.println(d1+ " " +m1+" " +y);}
	}
	if(m==12)
	{
		if(d>=1 || d<=30)
		{d1=d+1;
		System.out.println(d1+ " " +m+" " +y);}
		else if(d==31)
		{d1=1;
		m1=1;
		y1=y+1;
		System.out.println(d1+ " " +m1+" " +y1);}
	}
	if(m==4 || m==6)
	{
		if(d>=1 || d<=29)
		{d1=d+1;
		System.out.println(d1+ " " +m+" " +y);}
		else if(d==30)
		{d1=1;
		m1=m+1;
		System.out.println(d1+ " " +m1+" " +y);}
	}
	if(m==9 || m==11)
	{
		if(d>=1 || d<=29)
		{d1=d+1;
		System.out.println(d1+ " " +m+" " +y);}
		else if(d==30)
		{d1=1;
		m1=m+1;
		System.out.println(d1+ " " +m1+" " +y);}
	}
//	{	
//	if(d==28 && m==2)
//	{d1=1;
//	m1=m+1;
//	System.out.println(d1+ " " +m1+" " +y);}	
//	}
/*	if(y%4==0)
		{
		if((d>=1 || d<=28)&& m==02)
		d1=d+1;
		System.out.println(d1+ " " +m+" " +y);
		}  
		{
		if(d==29 && m==2)
		d1=1;
		m1=m+1;
		System.out.println(d1+ " " +m1+" " +y);	
		}
*/		
	}
}


	/*	if (m==1 || m==3 || m==5 || m==7 || m==8 ||m==10)
		{	if(d>=1&&d<31)
                       	{ d1=d++;}
                        
			if(d==31)
			{m1= m+1;
			d1=1;}
		}
		
		if(m==12)
		{	if(d>=1&&d<31)
                       	{ d1=d++;}

			if(d==31)
			{y1=y+1;}
		}
		
		if (m==4 || m==6 || m==9 || m==11)
		{	if(d>=1&&d<30)
                       	{ d1=d++;}
                        
			if(d==30)
			{m1= m+1;
			d1=1;}
		}
<<<<<<< HEAD
	System.out.println(d1+ " " +m1+ " " +y1);
=======
	System.out.println(d1+" "+m1+" " +y1);
>>>>>>> 48e6d24de5e18905d6ff11229d0e208968e7defd
}
} */
		
	/*	if(m==2)
		{
			if(y%4==0)
			{}
			if(y%100==0 && y%400==0)
			{}
		}
	*/			