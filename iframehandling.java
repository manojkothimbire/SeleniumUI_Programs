package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.xpath("//input[@class='text_field']"));
		name.sendKeys("manoj");
	
	}

}
