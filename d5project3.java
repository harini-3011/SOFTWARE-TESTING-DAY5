package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class d5project3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement fname=driver.findElement(By.name("cusid"));
		fname.sendKeys("401");
		WebElement yesbutton=driver.findElement(By.name("submit"));
		yesbutton.click();
		Alert alert1 =driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(3000);
		fname.clear();
		fname.sendKeys("402");
		yesbutton.click();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		Alert alert3=driver.switchTo().alert();
		String txt=alert3.getText();
		alert3.accept();
		System.out.println(txt);
	}

}
