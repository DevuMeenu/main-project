package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homepage {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hexaclothes.netlify.app/");
		System.out.println("site open");
	}
  @Test
  public void scroll() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,2000)");
	  js.executeAsyncScript("window.scrollBy(0,-2000)");
	  System.out.println("scrolling success");
	  }
  @Test
  public void icon() {
	  driver.findElement(By.cssSelector("font-bold text-xl")).click();
	  System.out.println("not shows home page");
	  driver.findElement(By.name("inline-block px-4 hover:text-orange-500 duration-200")).click();
	  System.out.println("navigate to top rated");
	  driver.findElement(By.xpath("inline-block px-4 hover:text-orange-500 duration-200")).click();
	  System.out.println("naviagate to kids wear");
	  driver.findElement(By.xpath("text-xl cursor-pointer text-white bg-orange-600 rounded-full p-1 hover:bg-orange-300 transition-colors duration-300\"")).click();
	  System.out.println("cart opens");
	  driver.findElement(By.xpath("text-xl cursor-pointer text-white bg-orange-600 rounded-full p-1 hover:bg-orange-300 transition-colors duration-300\"")).click();
	  System.out.println("wishlist opens");
	  
	    }
  @AfterTest
  public void end() {
	  driver.quit();
  }

	  

  }

