package hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class g1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
         driver.get("http://122.166.192.191:9003/");
         driver.findElement(By.xpath("//a[.=' Post Free Ads']")).click();
         WebElement ele = driver.findElement(By.xpath("//select[@id='parent']"));
         Select sel=new Select(ele);
        List<WebElement> opt = sel.getOptions();
        for(WebElement o:opt)
        {
        	System.out.println(o.getText());
        }
    //      sel.selectByValue("85");
	}
}
