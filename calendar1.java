
public class calendar1{
	public static void main(String args[]){
		int d1,d2=0,m1,m2=0,y1,y2=0;
		d1=Integer.parseInt(args[0]);		
		m1=Integer.parseInt(args[1]);
		y1=Integer.parseInt(args[2]);
		if(d1<1 || d1>31 || m1<1 || m1>12 || y1<1)
		System.out.println("Invalid Date");
		else if ((m1==4 || m1==6 || m1==9 || m1==11) && d1==31)
		System.out.println("Invalid Date");
	{
		if(m1==1 || m1==3 || m1==5 || m1==7 || m1==8 || m1==10)
		{
			if(d1>=1 && d1<31)
			{d2=d1+1;m2=m1;}
			else if(d1==31)
			{d2=1;m2=m1+1;}
			y2=y1;
		//System.out.println("Next Date : " + d2+" " + m2+" " + y2);
		}
		else if (m1==12)
		{
			if(d1>=1 && d1<31)
			{d2=d1+1;m2=m1;}
			else if(d1==31)
			{d2=1;m2=1;y2=y1+1;}
		//System.out.println("Next Date : " + d2+" " + m2+" " + y2);
		}
		else if (m1==4 || m1==6 || m1==9 || m1==11)
		{
			if(d1>=1 && d1<30)
			{d2=d1+1;m2=m1;}
			else if(d1==30)
			{d2=1;m2=m1+1;}
			y2=y1;
		//System.out.println("Next Date : " + d2+" " + m2+" " + y2);
		}
		else if (m1==2)
                {
			if (y1%4!=0)
			{
				if(d1>=1 && d1<28)
				{d2=d1+1;m2=m1;}
				else if(d1==28)
				{d2=1;m2=m1+1;}
				y2=y1;
		//System.out.println("Next Date : " + d2+" " + m2+" " + y2);
			}
			else if (y1%100==0 && y1%400!=0)
			{
				if(d1>=1 && d1<28)
				{d2=d1+1;m2=m1;}
				else if(d1==28)
				{d2=1;m2=m1+1;}
				y2=y1;
		//System.out.println("Next Date : " + d2+" " + m2+" " + y2);
			}
			else
			{
				if(d1>=1 && d1<29)
				{d2=d1+1;m2=m1;}
				else if(d1==29)
				{d2=1;m2=m1+1;}
				y2=y1;
		//System.out.println("Next Date : " + d2+" " + m2+" " + y2);
			}
		}
		System.out.println("Next Date : " + d2+" " + m2+" " + y2);
		/*System.out.println(d2);
		System.out.println(m2);
		System.out.println(y2);*/
}}}
	