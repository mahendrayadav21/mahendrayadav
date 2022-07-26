package mobileworld;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class signin extends Gen {
@Test
public void signup() throws InterruptedException {
driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
Thread.sleep(4000);
driver.findElement(By.linkText("Sign up")).click();
driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Manu");
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Yadav");
driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("manu21212@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("qualitest2121");
driver.findElement(By.xpath("//input[@type='date']")).sendKeys("31-01-1999");
driver.findElement(By.xpath("//input[@type='radio']")).click();
driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("4343434343");
driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("I want to  order a phone");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
//.quit();
}
}
