package testCase;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;


public class Colour
{
	WebDriver driver = new FirefoxDriver();
	
	public String Login(String fname) throws InterruptedException 
	{
		String screenshotfilepath = null;
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		screenshotfilepath = "E:\\Selenium"+fname+".png";
        try {
			FileUtils.copyFile(scrFile, new File(screenshotfilepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        scrFile = null;
        System.out.println(screenshotfilepath);
        return screenshotfilepath;
	}
	@Test
	public void lanch() throws InterruptedException{
		driver.get("https://www.ksrtc.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		Login("Sample");
	}
		
		
		/*Alert alert=driver.switchTo().alert();
		alert.getText();
		System.out.println("Text of an alert:"+alert.getText());=============*/
		
		/*driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("login")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return document.getElementById('email').value='chaitubond2727@gmail.com'");
		 js.executeScript("return document.getElementById('pass').value='ap15ax7268';");
		
		driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(3000);
		 
		js.executeScript("scroll(0,300)");
		//driver.quit();
*===========*/	

		/*driver.get("https://www.facebook.com/login/");
		
		WebElement element=driver.findElement(By.id("email"));
		element.sendKeys("chaitubomd2727@mail.com");
		
		Actions ac=new Actions(driver);
		//ac.sendKeys(Keys.RETURN).perform();
		//ac.sendKeys(Keys.TAB).perform();
		
		ac.moveToElement( element).contextClick().build().perform();
		ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();
		
		ac.sendKeys(Keys.CONTROL+"A").build().perform();
		ac.sendKeys(Keys.DELETE).build().perform();
		
		Thread.sleep(10000);
		driver.quit();
		element.sendKeys("chaitubomd2727@gmail.com");
		ac.sendKeys(Keys.BACK_SPACE ).build().perform();
		ac.sendKeys(Keys.BACK_SPACE ).build().perform();
		*/
			
	
	}

