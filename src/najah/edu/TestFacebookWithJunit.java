package najah.edu;


//import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;





public class TestFacebookWithJunit {
	static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\futnashoqo\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	
	@Test
	public void test() {
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ya_2lbi_f@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("fatoon2332018");

		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

}
