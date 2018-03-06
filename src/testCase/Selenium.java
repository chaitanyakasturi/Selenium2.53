package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium 
{
WebDriver driver=new FirefoxDriver();
@Test
public void launch()
{   
	driver.get("https://www.youtube.com/watch?v=PoMehCHkJ-4");
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println((driver.findElement(By.xpath("//div[contains(@id,'count')]"))));
	/*driver.get("https://www.redbus.in/search?fromCityName=Bangalore&fromCityId=122&toCityName=Hyderabad&toCityId=124&onward=02-Mar-2018&opId=0&busType=Any");
	driver.findElement(By.xpath(".//*[starts-with(@id,'modify_search_button')]")).click();
	Xpath
	driver.get("https://twitter.com/narendramodi?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
	driver.findElement(By.xpath("//img[contains(@src,'data:image')]")).click();
	driver.findElement(By.xpath(".//*[contains(@name,'session')]")).sendKeys("chaitnayakasturi27@gmail.com");
	*/
	/*driver.get("https://www.facebook.com/");	
	WebElement str=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
	System.out.println(str.getAttribute("title"));
    driver.close();*/
}

public void getalllinkscount(){
	
	driver.get("http://localhost/colour/");
	List<WebElement> linkedlistcount=driver.findElements(By.tagName("a"));
	
	System.out.println("No of Linkedlists in Colourclassified page:" + linkedlistcount.size());
}

public void getalllinksTEXT(){
	
	driver.get("http://localhost/colour/");
	List<WebElement> linkedlistcount=driver.findElements(By.tagName("a"));
	for(int i=0;i<linkedlistcount.size();i++)
	{
	System.out.println(linkedlistcount.get(i).getText());	
	}
	
}}
