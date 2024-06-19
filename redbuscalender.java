package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbuscalender {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.redbus.in/");
		Thread.sleep(2000);
		
		List<String> weekenddate=getWeekendDates("Mar 2024");
		System.out.println(weekenddate);
	}

	private static List<String> getWeekendDates(String value) {
		
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		
		while(true)
		{
			if(value.equals(value))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("")).click();
			}
		}
		return null;
	}

}
