package Maven_Package.Maven_TestNG_class_project.driver_start;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class driver_class {
	public WebDriver driver;
	public Properties rProperties;
	public File configFile;
	FileInputStream fileStream;

	public void initialization() throws IOException{
		loadproperties();
		selectbrowser(rProperties.getProperty("browsername"));
		driver.get(rProperties.getProperty("websiteurl"));
		//verifytitle("My Store");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void loadproperties() throws IOException
	{
		// load properties file
		rProperties = new Properties();
		configFile = new File(System.getProperty("user.dir") + "/src/main/java/Maven_Package/Maven_TestNG_class_project/config/testdata.properties");
		fileStream = new FileInputStream(configFile);
		rProperties.load(fileStream);
		
			
		
	}
	
	
	public void verifytitle(String websitetitle)
	{
		String actual=driver.getTitle();
		Assert.assertEquals(websitetitle, actual);
		
	}
	
	
	public void selectbrowser(String browsername){
		if(browsername.equalsIgnoreCase("chrome"))
		{
			
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
	}
	
	public void closebrowser(){
		driver.quit();
	}

}
