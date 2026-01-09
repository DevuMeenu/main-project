package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class products {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hexaclothes.netlify.app/");
		System.out.println("site open");
		}
  @Test
  public void product() {
	  driver.findElement(By.xpath("inline-block px-4 hover:text-orange-500 duration-200")).click();
	  System.out.println("kids wear opens");
	  driver.findElement(By.xpath("flex items-center gap-2 px-6 py-3 bg-orange-600 text-white rounded-full hover:bg-orange-700 transition duration-300 ease-in-out transform hover:scale-105")).click();
	  driver.findElement(By.xpath("text-xl cursor-pointer text-white bg-orange-600 rounded-full p-1 hover:bg-orange-300 transition-colors duration-300\"")).click();
	  System.out.println("item is added to cart");
	  driver.navigate().back();
	  driver.findElement(By.xpath("inline-block px-4 hover:text-orange-500 duration-200")).click();
	  System.out.println("kids wear opens");
	  driver.findElement(By.xpath("p-3 border rounded-full transition duration-300 ease-in-out transform hover:scale-105 border-black")).click();
	  driver.findElement(By.xpath("text-xl cursor-pointer text-white bg-orange-600 rounded-full p-1 hover:bg-orange-300 transition-colors duration-300\"")).click();
	  System.out.println("item is added to cart");
	  
  }
  @AfterTest
  public void end() {
	  driver.quit();
  }
}
