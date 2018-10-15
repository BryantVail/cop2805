package week06;

//import test.AbstractTestHarness;
import org.junit.Test;


public class TestHarness extends AbstractTestHarness
{

	 public static void main(String[] args)
	 {
	 new TestHarness().runTests();
	
	 }
	
	protected void runTests()
	{
		try
		{
			trace("Running tests version 2");
			boolean sortTest = executeTest(TestCaseSorting.class);
			boolean javadocTest = executeTest(JUnitJavadocValidation.class);
			boolean result = sortTest && javadocTest;

			trace(result ? "Tests Passed" : "Tests Failed");
		}
		catch(Exception ex)
		{
			trace(ex.getMessage());
		}
	}
}
