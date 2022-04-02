package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basepackage.BaseHRMClass;
import pompackage.PomLogin;

public class LoginTest extends BaseHRMClass{
	PomLogin Log;
		public LoginTest() {
			super();
	}
@BeforeSuite
public void initsetup() {
	initiate();
	
	 Log=new PomLogin();
}
@Test(priority=1)
public void Title() {
	String actual=Log.verify();
	Assert.assertEquals(actual, "OrangeHRM");
}
@Test(priority=2)
public void username() throws InterruptedException {
	Log.typeusername("Admin");
	Thread.sleep(200);
}
@Test(priority=3)
public void password() throws InterruptedException {
	Log.typepassword("admin123");
	Thread.sleep(200);
}
@Test(priority=4)
public void login() {
	Log.button();
}
@AfterSuite
public void close() {
	driver.close();
}
}
