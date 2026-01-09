package checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class checkout {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("CVC");
		System.out.println("site open");
	}
  @Test
  public void chekout() {
	  driver.findElement(By.xpath("text-xl cursor-pointer text-white bg-orange-600 rounded-full p-1 hover:bg-orange-300 transition-colors duration-300")).click();
	  System.out.println("cart opens");
	  driver.findElement(By.xpath("w-full bg-yellow-500 text-white py-2 px-4 rounded hover:bg-yellow-600 transition-colors duration-300")).click();
	  System.out.println("proceed to checkout");
	  driver.findElement(By.xpath("First Name")).sendKeys("devika");
	  driver.findElement(By.xpath("Last Name")).sendKeys("m");
	  driver.findElement(By.xpath("Email Address")).sendKeys("8113815589devu@gmail.com");
	  driver.findElement(By.xpath("Address")).sendKeys("sankaramangalam,thiruvalla");
	  driver.findElement(By.xpath("City")).sendKeys("pathanamthitta");
	  driver.findElement(By.xpath("Postal Code")).sendKeys("787876");
	  driver.findElement(By.xpath("Card Number")).sendKeys("435646567587687");
	  driver.findElement(By.xpath("Cardholder Name")).sendKeys("devu");
	  driver.findElement(By.xpath("MM/YY")).sendKeys("22/23");
	  driver.findElement(By.xpath("CVC")).sendKeys("678");
	  driver.findElement(By.xpath("bg-orange-500 text-white py-3 px-6 rounded-md hover:bg-orange-600 transition-colors duration-300")).click();
	  System.out.println("place order");
	  		
	  
  }
  @AfterTest
  public void end() {
	  driver.quit();
}
}
