package testscripts;
import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void testTest()
	{
		System.out.println(System.getProperty("Browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("userName"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("completed orgTest2"));
		
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
