package practice;
import org.testng.annotations.*;

public class TestNgTest
{
	@Test(priority=1)
	public void test1()
	{
	System.out.println("have a nice day");	
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Hello all");
	}

}
