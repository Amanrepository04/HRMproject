package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TimeUtils;

public class BaseHRMClass {

	//browser info WebDriver driver=new ChromeDriver();
	//url info
	//username and password

public static Properties prop=new Properties(); // to use method from Config.prpertoes
public static WebDriver driver;

//Step 1: Create constructor
public BaseHRMClass() {
	try {
	FileInputStream file=new FileInputStream("C:\\Users\\Varun Salgotra\\eclipse-workspace\\HRmanagement\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);
}
catch(FileNotFoundException e) {
	e.printStackTrace();
}
	catch(IOException a) {
		a.printStackTrace();
	}
}
	//Step 2 Create  method under which we will store all common commands which all child classes will be using
	
	public static void initiate() {
	//driver path WebDriver.chrome.driver, if we don't want to depend our code dependent on any roswer we can use if statement
		//if browser=chrome webdriver.chrome.driver
		//else if(browser=firefox){
		//webdriver.gecko.driver
		//maximize, pageload,implicit, getting url
	String browsername=prop.getProperty("browser");
	if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	
		driver=new FirefoxDriver();
	}
		else if(browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}
	
}



