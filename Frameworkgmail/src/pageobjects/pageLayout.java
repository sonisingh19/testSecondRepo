package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pakageBaseClass.BaseClass;

public class pageLayout extends BaseClass{
	
	@FindBy(xpath="//a[@class='login']")
	public static WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	public static WebElement username;
	
	@FindBy(xpath=".//*[@id='passwd']")
	public static WebElement password;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	public static WebElement submit;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	public static WebElement authenticationcheck;

	public pageLayout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
