package Global_and_Local_variables;

class Sample
{
	int v1 = 10;           //Global variable--Non-Static-- Data Member
	static double v2 = 2.3;//Global variable--Static-- Data Member
	
	//method decleration
	public void test(int num)//local variables
	{
		System.out.println("this is test() of Sample class");
		int z1 = 0;//local variables
		System.out.println("v1 : "+v1);                         //method defn
		System.out.println("v2 : "+v2);
		System.out.println("z1 : "+z1);
	}
	
	public void display()
	{
		System.out.println("this is display() of Sample class");
		System.out.println("v1 : "+v1);
		System.out.println("v2 : "+v2);
	  //System.out.println("z1 : "+z1); C.T.E
	}
}

public class Mainclass
{
	public static void main(String[] args)
	{
      Sample s1 = new Sample();
      s1.test(281);
      s1.display();
      
      //System.out.println(s1.z1); C.T.E
      
      System.out.println("v1 : "+s1.v1);
	}
}
