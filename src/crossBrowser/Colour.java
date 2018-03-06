package crossBrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Colour
{
WebDriver driver=new FirefoxDriver();
WebElement element;
@BeforeSuite
public void launch()

{
	
	driver.get("http://localhost/colour/");
	}
@Test
public void Login() 
{
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.findElement(By.id("login")).click();
	driver.findElement(By.id("username")).sendKeys("chaitanyakasturi27@gmail.com");
	driver.findElement(By.name("password")).sendKeys("ap15ax7268");
	//js.executeScript("driver.getElementById('username').value='chaitanyakasturi27@gmail.com';");
	//js.executeScript("driver.getElementById('password').value='ap15ax7268';");
	driver.findElement(By.name("submit")).click();
}
@AfterTest
public void Dropdown()
{
	
	
	driver.findElement(By.name("catid_search")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	/*Actions a=new Actions(driver);
	a.sendKeys(Keys.).build().perform();
	*/
}

public void logout()
{
	driver.findElement(By.xpath("//a[text()='Log out//']")).click();
	}
}

 /*   
@Test
//@Parameters("Browser")
@Parameters("Browser")
	public void colour(String BrowserName)
	{
		if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.IE.driver", "E:\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
	}
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		System.out.println(driver.getTitle());
		
}*/



