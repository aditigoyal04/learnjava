public class A
{
	void showMe()
	{
		System.out.println("I am from showMe of class A");
	}
}
class B extends A
{
	public static void main(String args[])
	{
		B b = new B();
		b.showMe();
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