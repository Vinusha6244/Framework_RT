package testscripts;
import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="SmokeTesting")
	public void testTest()
	{
		System.out.println("started smoke testing");
		System.out.println(System.getProperty("Browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("Environment"));
		System.out.println(System.getProperty("userName"));
		System.out.println(System.getProperty("password"));
		
		System.out.println("completed orgTest2 smoke testing");
		
	}
	
	@Test
	public void orgTest()
	{
		System.out.println("sample org1");
		System.out.println("sample org2.");
		System.out.println("sample org3");
		System.out.println("sample org4");
		System.out.println("sample org5");
		
	}

}
