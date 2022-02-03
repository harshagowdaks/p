package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hello1{
public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://122.166.192.191:9008/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[.=' Post a Job']")).click();
	driver.findElement(By.id("select2-category-container")).click();
	WebElement ele = driver.findElement(By.id("category"));
	Select sel=new Select(ele);
	sel.selectByValue("16");
	/*
	List<WebElement> option = s.getOptions();
	for (WebElement opt : option) {
		String text = opt.getText();
		System.out.println(text);
	}*/
}
}