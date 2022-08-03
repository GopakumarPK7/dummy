package RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer
{
int count=0;
int retryLimit=2;
	public boolean retry(ITestResult result)
	{
	while(count<retryLimit)
	{
		count++;
		return true;
	}
		return false;
	}

}
