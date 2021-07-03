package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Contactpage {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath = "//input[@value='SUBMIT']")
	WebElement submit_button;
	
	@FindBy(xpath = "//b[contains(text(),'CONTACT US')]")
	WebElement contact_page_title;
	
	@FindBy(xpath = "//label[contains(text(),'Please complete all required fields.')]")
	WebElement validation;
	
	// pagefactory
	public Contactpage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,60);
	}
	
	public void click_submit_button()
	{
		wait.until(ExpectedConditions.visibilityOf(submit_button)); // wait upto when submit button visible
		submit_button.click();  // click the submit button
	}
	
	public void contact_page_title()
	{
		wait.until(ExpectedConditions.visibilityOf(contact_page_title));  // wait upto when contact page title visible
		Assert.assertTrue(contact_page_title.isDisplayed());  //verifying the header of the contact page
	}
	
	public void validation_displays()
	{
		String str = "Please complete all required fields."; // store the validation message in string variable
		wait.until(ExpectedConditions.visibilityOf(validation)); // wait upto when validation is visible
		Assert.assertTrue(validation.isDisplayed()); // verifying that validation is dipslayed
		Assert.assertEquals(validation.getText(),str); //matching the validation text
	}

}
