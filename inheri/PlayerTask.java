abstract class Player
{
	  String name,country;
	  int age,weight,height;

		void setPlayer(String n, int a, int w, int h, String c)
		{	
			name=n;
			age=a;
			weight=w;
			height=h;
			country=c;
		}
		void showPlayer()
		{	
			System.out.println("Name: "+name+" Age:-"+age+ " Weight: "+weight+ " Height: "+height+ " Country: " +country);
		}	
}
	
class CricketPlayer extends Player
{
	int matches;
	int runs;
	int wickets;
	
	CricketPlayer(String n, int a, int w, int h, String c)
	{
	}
	CricketPlayer(String n, int a, int w, int h, String c,int m, int r, int wi)
	{
		//super(n,a,w,h,c);
		matches=m;
		runs=r;
		wickets=wi;	
		
	}
	void setCricketPlayer(int m, int r, int wi)	
	{
		matches=m;
		runs=r;
		wickets=wi ;	
	}
	void showCricketPlayer()
	{
		System.out.println("Matches:" +matches+ "  Runs: " +runs+ " Wickets : " +wickets);
	}	
}
class FootballPlayer extends Player
{
	int matches;
	int goals;
	FootballPlayer(String n, int a, int w, int h, String c)
	{
	}
	FootballPlayer(String n, int a, int w, int h, String c,int m, int g)
	{
		//super(n,a,w,h,c);
		matches=m;
		goals=g;
	}
	void setFootballPlayer(int m, int g)	
	{
		matches=m;
		goals=g;	
	}
	void showFootballPlayer()
	{
		System.out.println("Matches:" +matches+ "  Goals: " +goals);
	}	
}
class HockeyPlayer extends Player
{
	int matches;
	int goals;
	HockeyPlayer(String n, int a, int w, int h, String c)
	{
		//super(n,a,w,h,c);
	}
	HockeyPlayer(String n, int a, int w, int h, String c,int m, int g)
	{
		//super(n,a,w,h,c);
		matches=m;
		goals=g;
	}
	
	void setHockeyPlayer(int m, int g)	
	{
		matches=m;
		goals=g;	
	}	
	void showHockeyPlayer()
	{
		System.out.println("Matches:" +matches+ "  Goals: " +goals);
	}	
}

class Call
{
	public static void main(String args[])
	{
		CricketPlayer Dhoni = new CricketPlayer("Dhoni", 42,70,188,"India",300, 201112, 48);
		Dhoni.setPlayer("Dhoni", 42,70,188,"India");
		Dhoni.showPlayer();
		Dhoni.setCricketPlayer(300, 201112, 48);
		Dhoni.showCricketPlayer();
		
		FootballPlayer Li = new FootballPlayer("Lionel Messi", 30, 65, 168,"Argentina",40,50);
		Li.setPlayer("Lionel Messi", 30, 65, 168,"Argentina");
		Li.showPlayer();
		Li.setFootballPlayer(40,50);
		Li.showFootballPlayer();
	
		HockeyPlayer Si = new HockeyPlayer("Sidney Crosby", 29,67,200,"Canada");
		Si.setPlayer("Sidney Crosby", 29,67,200,"Canada");
		Si.showPlayer();
		Si.setHockeyPlayer(35, 43);
		Si.showHockeyPlayer();
	}
}