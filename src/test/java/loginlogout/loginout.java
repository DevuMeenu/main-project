package loginlogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginout {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hexaclothes.netlify.app/");
		System.out.println("site open");}
  @Test
  public void login() {
	  driver.findElement(By.xpath("px-4 py-2 bg-orange-600 text-white rounded-full hover:bg-orange-500 transition-colors duration-300 shadow-md")).click();
	  driver.findElement(By.id("email")).sendKeys("8113815589devu@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("abc@123");
	  driver.findElement(By.xpath("submit")).click();
	  System.out.println("login with valid mail id");
	  driver.navigate().back();
	  driver.findElement(By.id("email")).sendKeys("123gmail.com");
	  driver.findElement(By.id("password")).sendKeys("abc@123");
	  driver.findElement(By.xpath("submit")).click();
	  System.out.println("login not possible");
	  driver.navigate().back();
	  driver.findElement(By.id("email")).sendKeys("");
	  driver.findElement(By.id("password")).sendKeys("abc@123");
	  driver.findElement(By.xpath("submit")).click();
	  System.out.println("login not possible with blank email");
	  driver.navigate().back();
	  driver.findElement(By.id("email")).sendKeys("8113815589devu@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("");
	  driver.findElement(By.xpath("submit")).click();
	  System.out.println("login not possible with blank password");
	  
		
}
  @AfterTest
  public void end() {
	  driver.quit();
  }
  }

