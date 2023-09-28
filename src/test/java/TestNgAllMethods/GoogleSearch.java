package TestNgAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	@Parameters("KeyWord")
@Test
	public void GoogelSearchDate(String Data ) {
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https:www.google.com/");
WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"input\"]"));
searchbox.sendKeys(Data);
Assert.assertEquals(Data, searchbox.getAttribute("value"));
	}
}
