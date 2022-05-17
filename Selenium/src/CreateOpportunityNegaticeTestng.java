
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class CreateOpportunityNegaticeTestng  {



@Test
public void CreateOppurtunityNegativeScenario() {
WebDriverManager.chromedriver().setup();
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(option);
//ChromeDriver driver=new ChromeDriver();


driver.get("https://qeagle-dev-ed.my.salesforce.com/");
driver.manage().window().maximize();





driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
driver.findElement(By.id("password")).sendKeys("Tuna@123");
driver.findElement(By.id("Login")).click();


try {
TimeUnit.SECONDS.sleep(30);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
driver.findElement(By.xpath("//ul[@class='scrollable']//child::li[5]")).click();



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

driver.findElement(By.xpath("//ul[@class='lookup__list visible']//child::li[4]")).click();



driver.findElement(By.xpath("//a[@class='select']")).click();

driver.findElement(By.xpath("//div[@class='select-options']//ul[@role='presentation']//child::li[4]")).click();

driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber uiInput uiInput--default uiInput--input']")).sendKeys("123");

driver.findElement(By.xpath("//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']")).click();

}
}