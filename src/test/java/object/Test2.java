package object;

import org.openqa.selenium.WebDriver;

public class Test2 {
	
public static boolean validateURL(WebDriver driver,String expULR)
{
	boolean result=false;
	if(driver.getCurrentUrl().equalsIgnoreCase(expULR))
	{
		result=true;
		
	}
	return result;
}
}
