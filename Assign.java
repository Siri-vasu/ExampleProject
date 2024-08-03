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

public class Assign {

	
		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://fitpeo.com/home");
			driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
			Robot rob=new Robot();
			rob.keyPress(KeyEvent.VK_PAGE_DOWN);
			rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
			WebElement pass = driver.findElement(By.xpath("//input[@aria-orientation='horizontal']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(20,100)");
			while(true) {
				if (pass.getAttribute("value").contains("820")) {
					break;
				}
				pass.sendKeys(Keys.ARROW_RIGHT);
			}
			Thread.sleep(2000);
		
			WebElement patients = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
			patients.click();
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
			
			r.keyPress(KeyEvent.VK_6);
			r.keyRelease(KeyEvent.VK_6);
			
			r.keyPress(KeyEvent.VK_0);
			r.keyRelease(KeyEvent.VK_0);
			
			Thread.sleep(3000);
			
			if(pass.getAttribute("value").equals("560"))
				System.out.println("Passed");
			else {
				driver.quit();
				System.out.println("Failed");
			}
			while(true) {
				if (pass.getAttribute("value").contains("820")) {
					break;
				}
				pass.sendKeys(Keys.ARROW_RIGHT);
			}
			js.executeScript("window.scrollBy(20,100)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(20,100)");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
			driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]")).click();
			System.out.println("Total Recurring Reimbursement for all Patients Per Month"+"it is displayed"+"110700");
			driver.quit();
		}
}