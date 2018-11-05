package sapling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) throws Exception{
	WebDriver driver =new FirefoxDriver();
	driver.get("https://quality.saplingapp.io/#/login");
	driver.findElement(By.id("input_0")).sendKeys("veeru1@gmail.com");
	driver.findElement(By.id("input_1")).sendKeys("admin123!");
	Thread.sleep(3000);
    driver.findElement(By.xpath(".//*[@id='login-form']/form/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Dashboard")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/md-content[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'View Profile')]")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("edit_personal_info")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("twitter")).sendKeys("1234");
    driver.findElement(By.name("save_personal_info")).click();
	}
}

