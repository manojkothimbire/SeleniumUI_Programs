package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownlisthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select obj=new Select(country);
		obj.selectByVisibleText("AUSTRALIA");
		
		Thread.sleep(2000);
		obj.selectByValue("BELGIUM");
		Thread.sleep(2000);

		obj.selectByIndex(4);
		
		
	}

}
