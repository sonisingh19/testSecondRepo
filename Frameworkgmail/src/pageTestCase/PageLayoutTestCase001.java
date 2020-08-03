package pageTestCase;

import org.testng.annotations.Test;

import pageobjects.pageLayout;
import pakageBaseClass.BaseClass;

public class PageLayoutTestCase001 extends BaseClass {

	pageLayout page;
	
	@Test(priority=0)

	public void init()
	{
		setUp();
	}


	@Test(priority=1)
	public void pageLayoutTest()
	{
	page=new pageLayout(driver);
    page.signIn.click();
	page.username.sendKeys("ename@gmail.com");
	page.password.sendKeys("hello");
	page.submit.click();
	screenshot();
	}
	
	@Test(priority=2)
	public void pageLayoutTest1()
	{
   // pageLayout page=new pageLayout(driver);
    page.signIn.click();
    System.out.println("hello");
	page.username.sendKeys("ename1@gmail.com");
	page.password.sendKeys("hello");
	page.submit.click();
	screenshot();
	}

}
