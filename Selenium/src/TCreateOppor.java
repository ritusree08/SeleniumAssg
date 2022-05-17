import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TCreateOppor {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);

	}
	
	@And("Load the Application URL and login")
	
	public void LoadApplication() {
		
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		driver.findElement(By.id("Login")).click();
	}
	
	@And("go to global icon")
	
	public void GlobalIcon() {
		
		try {
			TimeUnit.SECONDS.sleep(30);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}


			driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
		
	}
	
	@And("select Create Opportunity")
	 public void NewOpportunity()
	 {
		driver.findElement(By.xpath("//ul[@class='scrollable']//child::li[5]")).click();

	 }
	
	
	@Given("Enter new opportunity name as {string}")
	
	public void OpportunityName(String name)
	{
		try {
			TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}


			driver.findElement(By.xpath("//input[@maxlength='120']")).sendKeys(name);
	}
	
	@And("Select account name")
	public void AccountName() {
		try {
			TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

			driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).click();

			try {
			TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

			driver.findElement(By.xpath("//div[@title='RAm']")).click();
	}
	
	@And("Select stage")
	public void SelectStage() {
		driver.findElement(By.xpath("//a[@class='select']")).click();

		driver.findElement(By.xpath("//div[@class='select-options']//ul[@role='presentation']//child::li[4]")).click();
	}
	
	@And("select amount")
	
	public void SelectAmount() {
		driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber uiInput uiInput--default uiInput--input']")).sendKeys("123");

	}
	
	@When("click on save")
	
	public void Save() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']")).click();

	}
	

	
	
	

}
