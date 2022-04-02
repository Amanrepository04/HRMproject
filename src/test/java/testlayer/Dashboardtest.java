package testlayer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import basepackage.BaseHRMClass;
import pompackage.POMdashboard;
import pompackage.PomLogin;

public class Dashboardtest extends BaseHRMClass{
WebDriver driver;
POMdashboard dash;
	
	public Dashboardtest() {
		super();
}
	
@BeforeMethod
public void initsetup() {
initiate();
PomLogin Log=new PomLogin();
Log.typeusername("Admin");
Log.typepassword("admin123");
Log.button();
dash=new POMdashboard();
}

@Test
public void myinfor() throws InterruptedException {

	//driver.findElement(By.cssSelector("#menu_pim_viewMyDetails > b")).click();
	dash.myinfor();
	Thread.sleep(200);
	dash.contactdetail();
	Thread.sleep(200);
	dash.edit();
	Thread.sleep(200);
}

@AfterMethod
public void close() {
driver.close();
}
	
	


}
