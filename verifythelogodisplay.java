package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifythelogodisplay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		WebElement googlelogo=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		if(googlelogo.isDisplayed())
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
	
		System.out.println(googlelogo.isDisplayed());
	}

}
