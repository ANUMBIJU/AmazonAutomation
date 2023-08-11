package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Baseclass {
	public static Properties prop=new Properties();
	public static WebDriver driver;
		
		public Baseclass() {
			
			try {
			
			FileInputStream file=new FileInputStream("C:\\Users\\alber\\eclipse-workspace\\Amazon.ca\\src\\test\\java\\environmentalvariables\\config.properties");
			 prop.load(file);
		}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException a){
				a.printStackTrace(); 
				
			}
			
			
				
			}
		public static void initiate() {
			String browsername=	prop.getProperty("browser");
			
		 
			if(browsername.equals("firefox")) {
				 System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				 driver=new FirefoxDriver();}
			
				 else if (browsername.equals("chrome")) {
						 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
						
						 driver=new ChromeDriver();
				 
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
			driver.get(prop.getProperty("url"));
			


}
}