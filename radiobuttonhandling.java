package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
	//	male.click();
		//Thread.sleep(2000);
		WebElement female=driver.findElement(By.xpath("//input[@id='female']"));
		//female.click();
		
		if(!male.isSelected())
		{
			male.click();
		}
		else
		{
			female.click();
		}
		
	}

}
