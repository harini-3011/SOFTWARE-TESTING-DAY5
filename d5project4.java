package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class d5project4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement fname=driver.findElement(By.id("source"));
		fname.sendKeys("COIMBATORE",Keys.ENTER);
		Thread.sleep(3000);
		fname.sendKeys(Keys.ENTER);
		WebElement dname=driver.findElement(By.id("destination"));
		dname.sendKeys("PERAMBALUR",Keys.ENTER);
		Thread.sleep(3000);
		dname.sendKeys(Keys.ENTER);
		WebElement tname=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		tname.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','04-5-2023')",tname);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]"));
		search.click();
		
		
		

	}

}
