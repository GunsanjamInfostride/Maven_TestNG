package Pages;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Setup.Launch_Browser;

public class Home_Page extends Launch_Browser
{
	String actualTitle;
	@Test
	public void Page() {
		actualTitle = driver.getTitle();
		assertEquals(actualTitle, "OrangeHRM");
}
@Test
    public void Logout() 
    {
    	driver.findElement(By.partialLinkText("Welcome")).click();
    	driver.findElement(By.linkText("Logout")).click();
    }
	
}
