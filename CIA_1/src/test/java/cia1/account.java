package cia1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
* Hello world!
*
*/
public class account
{
public static void main( String[] args ) throws InterruptedException
{

WebDriverManager.chromedriver().setup();
ChromeOptions co = new ChromeOptions();
co.addArguments(&quot;--remote-allow-origins=*&quot;);
WebDriver driver=new ChromeDriver(co);
driver.get(&quot;https://www.amazon.in/ref=nav_logo&quot;);
driver.manage().window().maximize();
String title=driver.getTitle();
System.out.println(title);
if(title.equals(&quot;Online Shopping site in India: Shop Online for Mobiles, Books, Watches,

Shoes and More - Amazon.in&quot;)) {

System.out.println(&quot;Verified title of the page&quot;);
}else {
System.out.println(&quot;Title not matched&quot;);
}
driver.findElement(By.id(&quot;nav-link-accountList&quot;)).click();

driver.findElement(By.id(&quot;ap_email&quot;)).sendKeys(&quot;feviliya28@gmail.com&quot;);
driver.findElement(By.id(&quot;ap_email&quot;)).sendKeys(Keys.ENTER);
driver.findElement(By.id(&quot;ap_password&quot;)).sendKeys(&quot;Fevi2802*&quot;);
driver.findElement(By.id(&quot;ap_password&quot;)).sendKeys(Keys.ENTER);
Thread.sleep(2000);
String name=driver.findElement(By.id(&quot;nav-link-accountList-nav-line-1&quot;)).getText();
if(name.equals(&quot;Hello, Feviliya&quot;)) {
System.out.println(&quot;Successfully, signed in&quot;);
}else {
System.out.println(&quot;Sign in failed&quot;);
}
System.out.println(&quot;Testing Ended&quot;);

driver.quit();
}
}
