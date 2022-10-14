package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import object.Test2;
import object.VerifyPersonalFeild;

public class Testmethods {
	WebDriver driver;
	boolean result;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		driver.get("https://numadic.com/careers/");
	}
	@Test
	public void testcase() throws InterruptedException
	{

		String actual_msg=driver.findElement(By.xpath("//*[@class=\"animated fadeIn mb-md\"]")).getText();
		String expected_msg="JOIN OUR CREW";
		Assert.assertEquals(expected_msg, actual_msg);
		Thread.sleep(2000);
		
	}
	@Test
	public void testcase2() throws InterruptedException
	{
		Select s=new Select(driver.findElement(By.xpath("//select[@id='job_type']")));
		s.selectByVisibleText("Full time");
		driver.findElement(By.xpath("//a[contains(text(),'QA Engineer')]")).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void testcase3() throws InterruptedException
	{
	   result = Test2.validateURL(driver, "https://numadic.com/careers/qa-engineer.php");
	   Assert.assertTrue(result);
	   Thread.sleep(2000);
		
		
	}
	@Test
	public void testcase4() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Apply here now')]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void testcase5() 
	{
		WebElement ele=driver.findElement(By.xpath("(//button[text()='Apply'])[12]"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		action.moveToElement(ele).click().perform();
		//Thread.sleep(2000);
	}
	@Test
	public void testcases6()
	{
		VerifyPersonalFeild v1=new VerifyPersonalFeild();
		
		v1.personalDetails(driver);
		
	}
	
	/*@AfterTest
	public void close()
	{
		driver.quit();
	}*/
	

}
