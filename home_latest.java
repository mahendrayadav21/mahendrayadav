package mobileworld;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class home_latest extends Gen{@Test
	public void test3()
	{
		driver.findElement(By.id("navbarDropdown")).click();//latest home
		driver.findElement(By.xpath("//a[@href='#samsung']")).click();//Samsung 
		driver.findElement(By.xpath("(//a[.='More Details'])[1]")).click();//more details
		driver.findElement(By.id("myInput")).sendKeys("sam");
		driver.findElement(By.id("navbarDropdown")).click();//support click
		driver.findElement(By.xpath("//a[@href='order.html']")).click();//order click
		
		Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator();//switch window
		String parent=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		//order page 
		driver.findElement(By.id("inputFirstName")).sendKeys("manu");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ssd");
		driver.findElement(By.id("inputEmail")).sendKeys("manu@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("manu@2000");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9012345678");
		driver.findElement(By.id(" address1")).sendKeys("brindavan");
		driver.findElement(By.id("address2")).sendKeys("Hassan");
		driver.findElement(By.id("inputCity")).sendKeys("Banglore");
		//city dropdown
		 WebElement staticDropdown1=driver.findElement(By.id("inputState"));
		 Select dropDown1=new Select(staticDropdown1);
		 dropDown1.selectByVisibleText("Karnataka");
		 //zip
		 driver.findElement(By.id("inputZip")).sendKeys("560024");
		 driver.findElement(By.xpath("(//option[@id='Samsung'])[1]")).click();
		 driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("2");
		 // bought dropdown
		WebElement staticDropdown2=driver.findElement(By.id("bought"));
		Select dropdown2=new Select(staticDropdown2);
		dropdown2.selectByVisibleText("Yes");
		 WebElement staticDropdown21=driver.findElement(By.id("bought"));
		    Select dropdown21=new Select(staticDropdown21);
		    dropdown21.selectByVisibleText("No");
		    //driver.findElement(By.xpath("//input[@id='time']")).sendKeys("1");
		    //dropdown2.selectByVisibleText("No");
		    driver.findElement(By.xpath("(//input[@id='gridCheck1'])[1]")).click();
		    driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).click();
		    driver.findElement(By.xpath("//button[@type='button']")).click();
		    //driver.findElement(By.xpath("//a[.='Close']")).click();		

}
}
