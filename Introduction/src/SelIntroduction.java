import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome
		//System.setProperty("webdriver.chrome.driver", "C:/Z/Swati Study Material/chromedriver_win32/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "path of gecko driver");
        //WebDriver driver = new FirefoxDriver();
		
		//Edge
        System.setProperty("webdriver.edge.driver", "C:/Z/Swati Study Material/Selenium and Java/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
	}

}
