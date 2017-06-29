abstract class Player
{
	 abstract String name();
	 abstract int age();
	 abstract int weight();
	 abstract int height();
	 abstract String country();
}
	
class CricketPlayer extends Player
{
	public static void main(String args[])
	{
		CricketPlayer CP = new CricketPlayer();
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
}