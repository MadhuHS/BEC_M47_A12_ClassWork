package constructors;

class Sample
{	
	public Sample()
	{
	  System.out.println("this is Sample-Constructor");	
	}
	 public void test()
	{
	  System.out.println("this test() of Sample");
	}
}

public class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts..");
		Sample s1 = new Sample();
		System.out.println("Program ends..");
	}
}
