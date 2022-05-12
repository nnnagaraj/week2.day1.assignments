package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();

		// 6. Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();
		
		// 7. Enter AccountName as "Credit Limited Account"
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		
		// 8. Click on Find Accounts using xpath Locator
		driver.findElement(By.xpath("//table[@id='ext-gen21']/tbody[1]/tr[1]/td[2]/em[1]/button[1]")).click();
		System.out.println("before edit");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("accountlimit100")).click();
		System.out.println("after edit");
		
		// 9. Click on the edit Button
		driver.findElement(By.linkText("Edit")).click();
	
		// 10. Get the Text of Account Name and verify

		String text = driver
				.findElement(By.xpath("//table[@class='fourColumnForm']/tbody[1]/tr[1]/td[2]/input[@id='accountName']"))
				.getAttribute("value");
		System.out.println(text);

		// 11. Get the Text of Description
		String text2 = driver.findElement(By.xpath("//textarea[@class='inputBox']")).getText();
		System.out.println(text2);
		
		// 12. Get the title of the page and verify it.
		String title = driver.getTitle();
		System.out.println(title);

	}

}
