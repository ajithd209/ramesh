package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class firefox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator.PC1\\eclipse-workspace\\S1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
WebElement txtid = driver.findElement(By.xpath("//a[@aria-controls='contact']"));
txtid.click();

WebElement txtname = driver.findElement(By.xpath("//h3[contains(text(),'Best Selenium Training')]"));
String text = txtname.getText();
System.out.println(text);


}
private void output() {
System.out.println("output");
}
}
