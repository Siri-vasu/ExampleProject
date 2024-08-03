package Assignmentttt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fitpeo.com/revenue-calculator");
		driver.findElement(By.xpath("(//div[contains(@class,\"satoshi\")])[6]")).click();
		Thread.sleep(2000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebElement pass=driver.findElement(By.xpath("//input[@aria-orientation=\"horizontal\"]"));
		for(; ;)
		{
			if(pass.getAttribute("value").contains("820"))
			{
				break;
			}
			pass.sendKeys(Keys.ARROW_RIGHT);
		}
		//Thread.sleep(2000);
		//pass.clear();
		Thread.sleep(4000);
		//WebElement d=driver.findElement(By.xpath("//input[@type='number']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value='820';", d);
	   driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
	   driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
	   driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
	   driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]")).click();
	   System.out.println(" Total Recurring\r\n"
	   		+ "Reimbursement for all Patients Per Month:)" + "is displayed");
	  
		driver.close();
	}

}
	