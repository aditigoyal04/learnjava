public class Cal
{
	public static void main(String args[])
	{
	int d1,m1,y1;
	int d=Integer.parseInt(args[0]);
	int m=Integer.parseInt(args[1]);
	int y=Integer.parseInt(args[2]); //string ko integer me convert karne k lie ye particular statement use hota hai
		
		if (m==1 || m==3 || m==5 || m==7 || m==8 ||m==10)
		{	if(d>=1&&d<31)
                       	{ d1=d++;}
                        
			if(d==31)
			{m1= m+1;
			d=1;}
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
			d=1;}
		}
	System.out.println(+d1 " " +m1 " " +y1);
}
}
		
	/*	if(m==2)
		{
			if(y%4==0)
			{}
			if(y%100==0 && y%400==0)
			{}
		}
	*/			