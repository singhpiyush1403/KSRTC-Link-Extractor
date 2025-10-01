
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ksrtc {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://ksrtc.com");
	driver.manage().window().maximize();
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	
	for(int i=0; i<links.size(); i++) {
		if(!links.get(i).getText().isEmpty()) {
			System.out.println(links.get(i).getText());
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	//driver.quit();

	}

}
