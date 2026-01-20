package testscripts;
import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups="SmokeTesting")
	public void testTest()
	{
		
		System.out.println(System.getProperty("Browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("Environment"));
		System.out.println(System.getProperty("userName"));
		System.out.println(System.getProperty("password"));
		System.out.println("completed contactTest1");
		
	}
	
	@Test
	public void sampleTest()
	{
		System.out.println("sample test2.");
		System.out.println("sample test2.");
		System.out.println("sample test3");
		System.out.println("sample test4");
		System.out.println("sample test5");
		
	}

}
