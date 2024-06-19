package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webcalenderhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		WebElement datapicker=driver.findElement(By.id("dateOfBirthInput"));
		datapicker.click();
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.className("react-datepicker__month-select"));
		Select select=new Select(month);
		select.selectByVisibleText("April");
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.className("react-datepicker__year-select"));
		Select obj=new Select(year);
		obj.selectByValue("2025");
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, April 6th, 2025' and text()='6']"));
		day.click();
		
	}

}
