abstract class Abs
{
	abstract void showName();
	void showRandonString()
	{
		System.out.println("I am a string");
	}
}
class Xyz extends Abs
{
	public static void main(String args[])
	{
		Xyz z = new Xyz();
		z.showRandonString();
	}
	void showName()
	{
		System.out.println("Xyz");
	}
}
