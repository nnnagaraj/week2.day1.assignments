package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			  
//		 1. Launch URL "http://leaftaps.com/opentaps/control/login"
            driver.get("http://leaftaps.com/opentaps/control/login");
//		 
//		 2. Enter UserName and Password Using Id Locator
		    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    
//		 3. Click on Login Button using Class Locator
		    driver.findElement(By.className("decorativeSubmit")).click();
		    
//		 4. Click on CRM/SFA Link
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    
//		 5. Click on Accounts Button
		    driver.findElement(By.linkText("Accounts")).click();
		    
//		 6. Click on Create Account
		    driver.findElement(By.linkText("Create Account")).click();
		    
//		 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		    driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Debit Limited Accounts");
		    
//		 8. Enter DEscriptiion as "Selenium Automation Tester"
		    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		    
//		 9. Enter LocalName Field Using Xpath Locator
		    driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Nagaraj Nagendran");
		    
//		10. Enter SiteName Field Using Xpath Locator
		    driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		    
//		11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		    driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("25000");
		    
//		12. Select Industry as ComputerSoftware
//		    driver.findElement(By.xpath("(//select[@name='industryEnumId']/option[@value='IND_SOFTWARE'])"));
		   
		    WebElement findElement = driver.findElement(By.xpath("(//select[@name='industryEnumId'])"));
		    Select sel = new Select(findElement);
		    sel.selectByIndex(3);
		    
//		13. Select OwnerShip as S-Corporation using SelectByVisibletext
		    WebElement findElement1 = driver.findElement(By.xpath("(//select[@name='ownershipEnumId'])"));
		    Select sel1 = new Select(findElement1);
		    sel1.selectByVisibleText("S-Corporation");
		    
//		14. Select Source as Employee using SelectByValue
		    WebElement findElement2 = driver.findElement(By.xpath("(//select[@name='dataSourceId'])"));
		    Select sel2 = new Select(findElement2);
		    sel2.selectByValue("LEAD_EMPLOYEE");

//		15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		    WebElement findElement3 = driver.findElement(By.xpath("(//select[@name='marketingCampaignId'])"));
		    Select sel3 = new Select(findElement3);
		    sel3.selectByIndex(6);
		    
//		16. Select State/Province as Texas using SelectByValue 
		    WebElement findElement4 = driver.findElement(By.xpath("(//select[@name='generalStateProvinceGeoId'])"));
		    Select sel4 = new Select(findElement4);
		    sel4.selectByValue("TX");

//		17. Click on Create Account using Xpath Locator
		    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}

}