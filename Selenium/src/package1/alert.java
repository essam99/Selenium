package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.v1robot.com/alert.html"); 
		
        String alertMessage = "";
        driver.findElement(By.cssSelector("input[value=\"CLICK ME\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMessage);
        
        driver.close(); 
        
    }
}
