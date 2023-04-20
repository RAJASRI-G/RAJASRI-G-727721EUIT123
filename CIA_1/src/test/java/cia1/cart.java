package cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/Apple-iPhone-Pro-Deep-Purple/dp/B0BDK64JGN/ref=sr_1_1_sspa?crid=35ILP6MUAQG2T&keywords=phone&qid=1681289937&sprefix=phone%2Caps%2C532&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		driver.manage().window().maximize();
		WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement checkout= driver.findElement(By.className("a-button-input"));
		checkout.click();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
	}

}
