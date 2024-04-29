package Config;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Reports_Config implements ITestListener
{
    private static ExtentReports extent = new ExtentReports();
    private static ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");

    static
    {
        extent.attachReporter(htmlReporter);
    }

    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();
    }
}

