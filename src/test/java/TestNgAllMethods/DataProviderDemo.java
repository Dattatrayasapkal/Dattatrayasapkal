package TestNgAllMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//
	
	
	public class DataProviderDemo {
		@DataProvider(name="SearchDataSet")
			public Object [][] searchData(){
				Object[][] searchKeyword= new Object[3][2];
				
				searchKeyword[0][0]= "India";
				searchKeyword[0][1]= "Qutub Minar";
				searchKeyword[1][0]= "Agra";
				searchKeyword[1][1]= "Taj Mahal";
				searchKeyword[2][0]= "Hyderbad";
				searchKeyword[2][1]= "Charminar";
				
				return searchKeyword;

			}
				
			@Test(dataProvider = "SearchDataSet")
			public void TestCaseGoogleSearch(String Country,String Monument) {
				
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("http://www.google.com/");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			WebElement searchbox = driver.findElement(By.name("q"));
			
			
			searchbox.sendKeys(Country +" "+Monument);
			
			driver.findElement(By.name("btnK")).submit();
			
			
			}
		}
	
	
	
	
	
	
	
	
	
	
	

