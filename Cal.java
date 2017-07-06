public class Cal
{
	public static void main(String args[])
	{
	int d1=0,m1=0,y1=0;
	int d=Integer.parseInt(args[0]);
	int m=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]); //string ko integer me convert karne k lie ye particular statement use hota hai
	int invalidCheck=0;

if(m<1 || m>12 || y<1 || d<1 || d>31 || d==0 || m==0 || y==0)
{
	System.out.println("Entered invalid date");
	invalidCheck=1;
}

if((m==4 || m==6 || m==9 || m==11)&& d==31)
{
	System.out.println("Entered invalid date");
	invalidCheck=1;
}

if(m==2&&d>=30)
{
	System.out.println("Entered invalid date");
	invalidCheck=1;
}

if((y%4!=0 || ( y%100==0 && y%400!=0)) && d==29)
{
	System.out.println("Entered invalid date");
	invalidCheck=1;
}

if(m==12)
{	
	if(d==31)
	{
		d1=1;
		m1=1;
		y1=y+1;
	}
	else if(d>=1 && d<=30)
	{
		d1=d+1;
		m1=m;
		y1=y;
	}
	//	System.out.println(d1+ " " +m1+ " " +y1);
}

if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10)
{	
	if(d==31)
	{
		d1=1;
		m1= m+1;
		y1=y;
	}
	else if(d>=1 && d<=30)
	{
		d1=d+1;
		m1=m;
		y1=y;
	}
	// 	System.out.println(d1+ " " +m1+" " +y1);
}

if(m==4 || m==6 || m==9 || m==11)
{
	if(d==30)
	{
		d1=1;
		m1=m+1;
		y1=y;
	}
	else if(d>=1 && d<=29)
	{
		d1=d+1;
		m1=m;
		y1=y;
	}
	//	System.out.println(d1+ " " +m1+ " " +y1);
}
	
if(m==2)
{
	if(y%4==0)						
	{
		if(y%100==0 && (y%400)!=0)	//3000
		{
			if(d>=1 && d<=27)
			{
				d1=d+1; m1=m; y1=y; 
			}
			else if(d==28)
			{
				d1=1; m1=m+1; y1=y;
			}
		}
		else
		{
			if(d>=1 && d<=28)
			{
				d1=d+1; m1=m; y1=y; 
			}
			else if(d==29)
			{
				d1=1; m1=m+1; y1=y;
			}	
		}
	}
	else 
	{
		if(d>=1 && d<=27)
		{
			d1=d+1; m1=m; y1=y; 
		}
		else if(d==28)
		{
			d1=1; m1=m+1; y1=y;
		}
	}
								//	y= 2016 2000 3000
								//	2016!/400 & 2016!/100 
	// 	System.out.println(d1+ " " +m1+ " " +y1);	 		//	2000/400 & 2000/100
								 //	3000!/400 & 3000/100 
} 

	
 
if(invalidCheck!=1)
System.out.println(d1+ " " +m1+ " " +y1);

}}