package week01;

import java.util.List;
import test.AbstractTestHarness;

/**
 * File: TestHarness.java
 * @author Scott LaChance
 */
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
			boolean javadocTest = executeTest(JUnitJavadocValidation.class);
			boolean genericTest = executeTest(JUnitGenericStackTest.class);
			boolean result = javadocTest && genericTest;

			trace(result ? "Tests Passed" : "Tests Failed");
		}
		catch(Exception ex)
		{
			trace(ex.getMessage());
		}
	}
}