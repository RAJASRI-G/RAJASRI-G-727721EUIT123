package cia1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class view {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://www.amazon.in/s?k=phone&crid=TD16OT62SQ7W&sprefix=%2Caps%2C297&ref=nb_sb_ss_recent_1_0_recent");
		driver.manage().window().maximize();
		System.out.println("Page title is : " + driver.getTitle());
	}

}