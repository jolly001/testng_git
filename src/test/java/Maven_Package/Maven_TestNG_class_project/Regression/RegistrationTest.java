package Maven_Package.Maven_TestNG_class_project.Regression;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Maven_Package.Maven_TestNG_class_project.Pages.RegistrationPage;
import Maven_Package.Maven_TestNG_class_project.driver_start.driver_class;

public class RegistrationTest extends driver_class{
	
//driver_class object;
RegistrationPage reg;


@BeforeTest
	public void setup() throws IOException
	{
		initialization();
		reg=new RegistrationPage(driver);
		
	}
	
	@Test
	public void registrationmethod()
	{
		boolean registrationcheck=reg.registration();
		if(registrationcheck==true){
			Assert.assertTrue(true, "registration first step worked");
		}
		else
		{
			Assert.assertTrue(false, "registration first step did not worked");
		}
		
	}
	
	@AfterTest
	public void close_browser()
	{
		closebrowser();
	}

}
