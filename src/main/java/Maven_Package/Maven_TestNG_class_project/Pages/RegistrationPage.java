package Maven_Package.Maven_TestNG_class_project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Maven_Package.Maven_TestNG_class_project.Utilities.CommonFunctions;
import Maven_Package.Maven_TestNG_class_project.driver_start.driver_class;

public class RegistrationPage extends CommonFunctions{
WebDriver driver;	

	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
public boolean registration()
{

	System.out.println("reached in registerwebsite method");
	click(By.xpath("//a[@class='login' and @title='Log in to your customer account']"),driver);
	enter_text(By.xpath("//input[@type='text' and @id='email_create']"),driver,"gurjot1234565@gmail.com");
	//driver.findElement(By.xpath("//input[@type='text' and @id='email_create']")).sendKeys("gurjot1234565@gmail.com");
	driver.findElement(By.xpath("//span/i[@class='icon-user left']")).click();
	Integer sizeofele=driver.findElements(By.xpath("//h1[contains(text(),'Create an account')]")).size();
	if(sizeofele==1)
	{
		System.out.println("create account is tapped");
		return true;
	}
	else
	{
		return false;
	}
}

}
