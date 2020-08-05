package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clinic 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://online.v1robot.com/";
        driver.get(baseUrl);

        String actualTitle, expectedTitle = "حجز عيادة | إدارة العيادات الطبية بالأكاديمية البحرية - فرع القاهرة";
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle))
            System.out.println("Title is correct");
        else 
            System.out.println("Title is not correct");
        
        String tagName, tagName2;
        Dimension dimension;
        tagName = driver.findElement(By.id("patientID")).getTagName();
        tagName2 = driver.findElement(By.cssSelector("button#submit")).getTagName();
        dimension = driver.findElement(By.id("submit")).getSize();
        System.out.println("Tag name 1 = " + tagName + ", Tag name 2 = " + tagName2 + ", Dimension = " + dimension);
        
        driver.close();
    }
}
