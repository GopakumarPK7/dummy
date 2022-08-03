package MavenDummy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyz
{
	@Test(retryAnalyzer =RetryAnalyzer.RetryAnalyzerImplementation.class )
public void practice() {
	System.out.println("practice1");
	Assert.fail();
	System.out.println("practice2");
	System.out.println("practice3");
}
}
