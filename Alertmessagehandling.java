package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessagehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement alertwithok=driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']"));
		alertwithok.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement alertwithcancel=driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
		alertwithcancel.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		WebElement alertwithtext=driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
		alertwithtext.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("manoj kumar");
		Thread.sleep(2000);
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		
		
		
	}

}
