abstract class Player
{
	 abstract String name();
	 abstract int age();
	 abstract int weight();
	 abstract int height();
	 abstract String country();

	void setPlayer(String n, String c, int a, int h, int w)
	{
		name =n;
		age=a;
		weight=w;
		height=h;
		country=c;
	}
}
	
class CricketPlayer extends Player
{
	String name;
	void setName(String n)
	{course=c;}
	{
	return "M.S. Dhoni";
	}
	int age()
	{
	return 40;
	}
	int weight()
	{
	return 75;
	}
	int height()
	{
	return 59;
	}
	String country()
	{
	return "India";
	}
}

class TestPlayer
{
	public static void main(String args[])
	{
		Player p;
		p= new CricketPlayer();		
		System.out.println("name :" +p.name());
		System.out.println("age :" +p.age());
		System.out.println("height :" +p.height());
		System.out.println("weight :" +p.weight());
		System.out.println("country :" +p.country());
	}
}

	/*CricketPlayer CP = new CricketPlayer();
		CP.showMe();
	}
	void showMeToo()
	{
		System.out.println("I am from showMeToo of class B");
	}
	void showMe()
	{
		System.out.println("I am from showMe of class B");
	}
}
class C extends B
{
	public static void main(String args[])
	{
		C b = new C();
		b.showMe();
	
	}
}*/