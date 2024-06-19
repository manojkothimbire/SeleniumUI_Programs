package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findoutthexandyco_ordinateOfElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\selenium with jar\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		WebElement googleSearch=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		Point p=googleSearch.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		
		Dimension d=googleSearch.getSize();
		System.out.println("height="+d.getHeight());
		System.out.println("width="+d.getWidth());
	
	}

}
