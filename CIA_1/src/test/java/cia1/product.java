package cia1;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class product {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement phone= driver.findElement(By.id("twotabsearchtextbox"));
		phone.sendKeys("phone");
		WebElement search= driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		List<WebElement> li =  driver.findElements(By.xpath("//*[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		for(WebElement l:li)
			System.out.print(l.getText()+" ");
	}

}
