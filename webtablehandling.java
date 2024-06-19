package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
		//find out the rows in the webtable
		
		int row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("rows in the table="+row);
		//find out the columns in the table
		
		int column=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("column in the table="+column);
		
		//fetch the perticular record from the table
		String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]")).getText();
		System.out.println(value);
		
		//fetch all the records from the table
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data);

			}
		}
		
	}

}
