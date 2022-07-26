package mobileworld;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;




public class contact_us extends Gen {
	@Test
	public void ContactUs() {
	driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
	driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
	 Set<String> win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		String parentId=it.next();
		String childId=it.next();
	   driver.switchTo().window(childId);
		driver.manage().window().maximize();
	driver.findElement(By.name("name")).sendKeys("Manu");
	driver.findElement(By.name("email")).sendKeys("manu@2000gmail.com");
	driver.findElement(By.name("phone")).sendKeys("9012345678");
	driver.findElement(By.name("message")).sendKeys("hy manu");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

}
