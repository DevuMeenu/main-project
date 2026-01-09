package manual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class manualmain {WebDriver driver;
@BeforeTest
public void launch() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("G:\\My Drive\\assignments\\manual main");
	System.out.println("site open");}
	//G:\My Drive\assignments\manual main
  @Test
  public void f() {
  }
}
