package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		//verify the perticular checkbox click or not ex sunday
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		checkbox.click();
		
		//find out the how much checkboxes are  on the webpage
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		System.out.println(checkboxes.size());
		//verify the all checkboxes click or not at a time
		
		for(WebElement chbox:checkboxes)
		{
			chbox.click();
		}
		
		
		//verify the two or more check boxes click or not ex sunday and saturday
		
		for(WebElement chbox:checkboxes)
		{
			String ckbox=chbox.getAttribute("id");
			if(ckbox.equals("monday")|| ckbox.equals("saturday")) {
				
			
			chbox.click();
		}
		}
		
	}

}
