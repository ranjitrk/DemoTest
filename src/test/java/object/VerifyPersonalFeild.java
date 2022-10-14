package object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VerifyPersonalFeild 
{
	
	public void personalDetails(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ranjit");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kurade");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
	
		WebElement staticDropdown= driver.findElement(By.xpath("//select[@id='sports']"));
		Select dropdown= new Select(staticDropdown);
		
		dropdown.selectByVisibleText("Cricket");;
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		WebElement staticDropdown1= driver.findElement(By.xpath("//select[@name='Dogs or Cats']"));
		staticDropdown1.click();
		Select dropdown1= new Select(staticDropdown1);
		dropdown.selectByIndex(2);
		//System.out.println(dropdown1.getFirstSelectedOption().getText());
	
		
		
		driver.findElement(By.xpath("//input[@id='current_city']")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@id='hometown']")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		driver.findElement(By.xpath("//td[@data-date='1097625600000']")).click();
		
		
		WebElement staticDropdown2=	driver.findElement(By.xpath("//select[@id='graduation_degree']"));
		staticDropdown2.click();
		
		/*Select dropdown2= new Select(staticDropdown2);
		dropdown.selectByVisibleText("BE");
		*/
		
		Actions act2=new Actions(driver);
		act2.keyDown(Keys.DOWN);
		act2.keyDown(Keys.DOWN);
		act2.keyDown(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='graduation_course']")).sendKeys("Mechanical");
		
		driver.findElement(By.xpath("//input[@id=\"graduation_college\"]")).sendKeys("JSPM university");
		
		driver.findElement(By.name("Percentage")).sendKeys("80%");
		
		
		
		WebElement staticDropdown3=	driver.findElement(By.xpath("//select[@id='postgraduation_degree']"));
		staticDropdown3.click();
		Actions act3=new Actions(driver);
		act2.keyDown(Keys.DOWN);
		act2.keyDown(Keys.DOWN);
		act2.keyDown(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@name=\"PG Specialization\"]")).sendKeys("null");
		
		driver.findElement(By.xpath("//input[@name='PG College']")).sendKeys("null");
		
		driver.findElement(By.xpath("//input[@name='PG Percentage']")).sendKeys("null");
		
		
		
		
		
		
		//id="postgraduation_degree"
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}