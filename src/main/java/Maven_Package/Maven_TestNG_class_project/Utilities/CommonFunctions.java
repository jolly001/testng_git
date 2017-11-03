package Maven_Package.Maven_TestNG_class_project.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Maven_Package.Maven_TestNG_class_project.Pages.RegistrationPage;
import Maven_Package.Maven_TestNG_class_project.driver_start.driver_class;

public class CommonFunctions{
	
	
	
	/*
	 * enter_text
	 * clear_text
	 * get_text
	 * get_array/list/set
	 * click
	 * element_exist_check
	 * element_dont_exist_check
	 * compare_text
	 * compare_arrays
	 * wait_for_element_appears
	 * explicit wait/smart wait
	 * mouse hover
	 * window handles
	 * dropdown
	 * iframe
	 * file_upload
	 */
	
	public void click(By by, WebDriver driver){
		driver.findElement(by).click();
		
	}
	
	public void enter_text(By by, WebDriver driver,String enterval){

		driver.findElement(by).sendKeys(enterval);
		
	}

}
