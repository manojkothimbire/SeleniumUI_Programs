package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filehandling {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://trytestingthis.netlify.app/");
	Thread.sleep(2000);
		
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='myfile']"));
		choosefile.sendKeys("C:\\Users\\admin\\Desktop\\xyz.txt");
	
	}

}
