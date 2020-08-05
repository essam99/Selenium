package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
        String baseUrl = "https://www.facebook.com";        
        driver.get(baseUrl);
        
        try 
        {
        	WebElement myelement = driver.findElement(By.name("email"));
        	if(myelement.isEnabled())
        		myelement.sendKeys("test@test.com");
        }
        catch(NoSuchElementException x)
        {
            System.out.println(x.toString());
        }
        WebElement myelement1 = driver.findElement(By.name("pass"));
        if(myelement1.isDisplayed())
        	myelement1.sendKeys("testtesttest");
        driver.findElement(By.id("loginbutton")).click();
        if(driver.getTitle() == "Facebook")
        	System.out.println("Login successfully");
        else
        	System.out.println("Login failed and URL = " + driver.getCurrentUrl());
        
        driver.close();
	}
	/*
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();	
        String baseUrl = "https://cairoreg.aast.edu/aastreg/frm_Register.aspx";        
        driver.get(baseUrl);
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$UserName")).sendKeys("16204011");
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$Password")).sendKeys("312550");
        driver.findElement(By.name("ctl00$ContentPlaceHolder1$btn_login")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_lmajor")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_Lbtn_Reg")).click();
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_lbtn_changeReg")).click();
        

        driver.findElement(By.id("ctl00_ContentPlaceHolder1_grdvw_courses_ctl02_btn_grp_time_table_details")).click();

        driver.get("https://cairoreg.aast.edu/aastreg/frm_CourseClassReg.aspx?pg=2");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_DL_CrsTimeTbl_ctl01_btn_select_cls")).click();
        
       
        driver.close();
	}
	*/
}
