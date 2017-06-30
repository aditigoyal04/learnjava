class Student
{
String name;
int age;
	Student(String n,int a)
	{	
		name=n;
		age=a;
	}
	
	void showStudent()
	{
		System.out.println("Name:-"+name+" Age:-"+age);
	}
}



class WebBhumiStudent extends Student
{
	String course;
	WebBhumiStudent(String n,int a)
	{
		super(n,a);
	}
	WebBhumiStudent(String n,int a,String c)
	{
		super(n,a);
		course=c;
	}
	void setCourse(String c)
	{
		course=c;
	}
}




class Actual
{
	public static void main(String args[])
	{
		WebBhumiStudent adarsh = new WebBhumiStudent("Adarsh",21);
		adarsh.showStudent();
		adarsh.setCourse("Java");
		WebBhumiStudent aditi = new WebBhumiStudent("Aditi",21,"Java");
		WebBhumiStudent sanjana = new WebBhumiStudent("Sanjana",21,"Java");
	}
}