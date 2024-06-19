package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findouttheTitleOFWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
//		String title=driver.getTitle();
//		System.out.println(title);
//		
		
		//verify the current page title
		
		String ExpectedTitle="OrangeHRM";
		String ActualTitle=driver.getTitle();
		
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(2000);
	
	
	}

}
