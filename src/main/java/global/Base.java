package global;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Base {

	
	public WebDriver driver;
	public Properties p;
	
	public WebDriver initilaizeDriver() throws IOException
	{
		 p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\balub\\eclipse-workspace\\PractiseEndtoEnd\\src\\main\\java\\global\\data.properties");
		p.load(fis);
		String browsername  = p.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://bharat//chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
			
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		return driver;
		
		
	}
	public String getScreenshotPath(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("userdir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
	
	
}
