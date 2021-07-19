package Classes_And_Objects;

class Demo
{
	static double z1 = 151.2;//static-Data member
	
	public static void display()//static-Function member
	{
		System.out.println("this is display() of Demo class");
	}
}

public class Mainclass 
{
	static int v1 = 172;//static-Data member
	
	public static void view()//static-Function member
	{
		System.out.println("this is view() of Main class");
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
	   
	   System.out.println("Program ends..");
	}
}
