package najah.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\futnashoqo\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ya_2lbi_f@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("fatoon2332018");

		//f
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
