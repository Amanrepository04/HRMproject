package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basepackage.BaseHRMClass;

public class POMdashboard extends BaseHRMClass{

@FindBy(css="#menu_pim_viewMyDetails > b")	WebElement myinfo;
@FindBy(linkText="Contact Details") WebElement contactdetails;
@FindBy(id="btnSave") WebElement edit;
@FindBy(id="contact_street1") WebElement street1;
@FindBy(id="contact_street2") WebElement street2;
@FindBy(id="contact_city") WebElement city;
@FindBy(id="contact_province") WebElement province;
@FindBy(id="contact_emp_zipcode") WebElement zipcode;
@FindBy(id="contact_country") WebElement country;
@FindBy(id="contact_emp_hm_telephone") WebElement hphone;
@FindBy(id="contact_emp_mobile") WebElement mphone;
@FindBy(id="contact_emp_work_telephone") WebElement wnumber;
@FindBy(id="contact_emp_work_email") WebElement wemail;


public POMdashboard() {
 PageFactory.initElements(driver, this);
}
	public void myinfor() throws InterruptedException {
		myinfo.click();
	}
public void contactdetail(){
	contactdetails.click();
}

public void edit() {
	edit.click();
}
public void typestreet1(String name) {
	street1.sendKeys(name);
}

}
