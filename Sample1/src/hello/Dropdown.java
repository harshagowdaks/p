package hello;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Manju%20SK/Q-Spiders/Selenium_Qspider/Documents/HTML%20Files/single_dropdown.html");
		WebElement ele = driver.findElement(By.id("ABC"));
		Select s =new Select(ele);
		 List<WebElement> option = s.getOptions();
		for (WebElement opt : option) {
			String text = opt.getText();
			System.out.println(text);
		}
	}
}