
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpportunityPositiveTestng {



@Test
public static void Test() throws InterruptedException{

WebDriverManager.chromedriver().setup();



ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");



ChromeDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://login.salesforce.com/?locale=in");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");



driver.findElement(By.name("pw")).sendKeys("Tuna@123");



driver.findElement(By.id("Login")).click();



Thread.sleep(7000);


driver.findElement(By.xpath("//ul[@class='slds-global-actions']//child::li[3]")).click();
driver.findElement(By.linkText("New Opportunity")).click();
driver.findElement(By.cssSelector("input[maxlength=\"120\"]")).sendKeys("E&Y");






driver.findElement(By.xpath("//a[@class='datePicker-openIcon display']")).click();



WebElement closedate = driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/span"));
Actions builder = new Actions(driver);
builder.moveToElement(closedate).click().perform();
driver.findElement(By.className("select")).click();
driver.findElement(By.xpath("//div[@class='select-options']//ul[@role='presentation']//child::li[4]")).click();



driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber uiInput uiInput--default uiInput--input']")).sendKeys("123");



driver.findElement(By.xpath("//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']")).click();



}
@AfterMethod
public void AfterUsingTest() {
System.out.println("Create Lead Is Completed");
}




}