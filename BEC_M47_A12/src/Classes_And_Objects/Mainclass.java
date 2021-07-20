package Classes_And_Objects;

class Demo
{
	static double z1 = 151.2;//static-Data member
	double k1 = 151.2;//Non-Static-Data member
	
	public static void display()//static-Function member
	{
		System.out.println("this is display() of Demo class");
	}
	
	public void show()//Non-Static-Function member
	{
		System.out.println("this is show() of Demo class");
	}
	
	public void click()//Non-Static-Function member
	{
		System.out.println("this is click() of Demo class");
	}
}

public class Mainclass 
{
	static int v1 = 172;//static-Data member
	double v2 = 2.67;//Non-Static-Data member
	
	
	public static void view()//static-Function member
	{
		System.out.println("this is view() of Main class");
	}
	
	
	public void count()//Non-Static-Function member
	{
		System.out.println("this is count() of Main class");
		System.out.println(v2);//Non-Static - same class
		
		new Demo().show();//Non-Static - different class
	}
	
	
	public static void main(String[] args)//static-Function member
	{
	   System.out.println("Program starts...");
	   
	   
	   view();//static - same class
	   System.out.println(v1);//static - same class
	   
	   Demo.display();//static - different class
	   System.out.println(Demo.z1);//static - different class
	   
	   Sample.test();//static - different class
	   System.out.println(Sample.m1);//static - different class
	   
	   new Mainclass().count();//Non-Static - same class
	   System.out.println(new Mainclass().v2);//Non-Static - same class
	   
	   new Demo().show();//Non-Static - different class
	   System.out.println(new Demo().k1);//Non-Static- different class
	   
	   
	   System.out.println("Program ends..");
	}
}
