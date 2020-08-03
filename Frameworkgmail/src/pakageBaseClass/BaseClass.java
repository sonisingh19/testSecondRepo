package pakageBaseClass;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

	public static WebDriver driver;
	

	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Jars\\Drivers_selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	public void screenshot()
	{
		try
		{
			Date d=new Date();
			String TimeStamp=d.toString().replace(" ", "_").replace(":", "_");
			String destination=System.getProperty("user.dir")+"\\screenshot\\s_"+TimeStamp+ ".PNG";
			TakesScreenshot screenshot	=(TakesScreenshot)driver;
			File f=screenshot.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(f, new File(destination));

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
