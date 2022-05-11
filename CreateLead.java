package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
 
//	 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
          driver.get("http://leaftaps.com/opentaps/control/login");
          
//	 * 2. Enter UserName and Password Using Id Locator
          driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
//	 * 3. Click on Login Button using Class Locator
		  driver.findElement(By.className("decorativeSubmit")).click();

//	 * 4. Click on CRM/SFA Link
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  
//	 * 5. Click on Leads Button
          driver.findElement(By.linkText("Leads")).click();
          
//	 * 6. Click on create Lead Button
          driver.findElement(By.linkText("Create Lead")).click();
          
//	 * 7. Enter CompanyName using id Locator
          driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NNN");
          
//	 * 8. Enter FirstName using id Locator
          driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nagaraj");

//	 * 9. Enter LastName using id Locator
          driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nagendran Nagarethinam");

//	 * 10. Select value as Employee in Source Using SelectbyVisible text
             WebElement findElement = driver.findElement(By.xpath("(//select[@name='dataSourceId'])"));
		    Select sel = new Select(findElement);
		    sel.selectByVisibleText("Employee");
		    
//	 * 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		    WebElement findElement1 = driver.findElement(By.xpath("(//select[@name='marketingCampaignId'])"));
		    Select sel1 = new Select(findElement1);
		    sel1.selectByValue("9001");

//	 * 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		    WebElement findElement2= driver.findElement(By.xpath("(//select[@name='ownershipEnumId'])"));
		    Select sel2 = new Select(findElement2);
		    sel2.selectByIndex(5);
		    
//	 * 14. Select value as India in Country Field Using SelectbyVisibletext
		    WebElement findElement3= driver.findElement(By.xpath("(//select[@name='generalCountryGeoId'])"));
		    Select sel3 = new Select(findElement3);
		    sel3.selectByVisibleText("India");
		    
//	 * 15. Click on create Lead Button Using name Locator
		    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
 
//	 * 16. Get the Title of the resulting Page
		    
		    System.out.println(driver.getTitle());

	}
	
}	