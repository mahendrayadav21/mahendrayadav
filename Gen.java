package mobileworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gen { WebDriver driver;
@Test
public void open() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahendra.yadav\\Desktop\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://mobileworld.azurewebsites.net/");
}
//@Test
//public void quit()
//{
//	  driver.quit();
//}

}
