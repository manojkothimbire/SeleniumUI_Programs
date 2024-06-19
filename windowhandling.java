package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow="+parentwindow);
		
		Thread.sleep(2000);
		
		WebElement childwindow=driver.findElement(By.id("newWindowBtn"));
		childwindow.click();
		Thread.sleep(2000);
		
		Set<String>set=driver.getWindowHandles();
		
		for(String handle:set)
		{
			System.out.println("childwindows="+handle);
			if(!handle.equals(parentwindow))
			{
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
				firstname.sendKeys("manoj");
				Thread.sleep(2000);
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("kumar");
		Thread.sleep(2000);
		driver.quit();
		
	
	}

}
