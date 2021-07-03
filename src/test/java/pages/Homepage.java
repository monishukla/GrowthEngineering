package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Homepage {
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	
	@FindBy(xpath = "(//div[@data-widget_type='theme-site-logo.default'])[1]")
	WebElement logo;
	
	@FindBy(xpath = "(//a[contains(text(),'Our Products')])[1]")
	WebElement OP;
	
	@FindBy(xpath = "(//a[contains(text(),'Our Approach')])[1]")
	WebElement OA;
	
	@FindBy(xpath = "(//a[contains(text(),'Resources')])[1]")
	WebElement RS;
	
	@FindBy(xpath = "(//a[contains(text(),'About Us')])[1]")
	WebElement AU;
	
	@FindBy(xpath = "//span[contains(text(),'GET IN TOUCH')]")
	WebElement GIT;
	
	@FindBy(xpath = "(//a[contains(text(),'The Knowledge Arcade')])[1]")
	WebElement KA;
	
	@FindBy(xpath = "//b[contains(text(),'KNO')]")
	WebElement KAP;
	
	@FindBy(xpath = "(//a[contains(text(),'Genie Authoring Tool')])[1]")
	WebElement GAT;
	
	@FindBy(xpath = "//b[contains(text(),'AU')]")
	WebElement GAT_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Genie Authoring Tool')])[1]")
	WebElement ALMS;
	
	@FindBy(xpath = "//b[contains(text(),'AU')]")
	WebElement ALMS_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Brain Science')])[1]")
	WebElement brain_science;
	
	@FindBy(xpath = "//b[contains(text(),'BEHAVIOUR CHANGE')]")
	WebElement brain_science_page;
	
	@FindBy(xpath = "(//a[contains(text(),'Social Learning')])[1]")
	WebElement social_learning_option;
	
	@FindBy(xpath = "//b[contains(text(),'LEA')]")
	WebElement social_learning_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Gamif')])[1]")
	WebElement gamification_option;
	
	@FindBy(xpath = "//h1[contains(text(),'Use the power of Gamification to ')]")
	WebElement gamification_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Personalisation')])[1]")
	WebElement personalisation_option;
	
	@FindBy(xpath = "//h1[contains(text(),'PERSONALISE ')]")
	WebElement personalise_option;
	
	@FindBy(xpath = "(//a[contains(text(),'Downloads')])[1]")
	WebElement downloads_option;
	
	@FindBy(xpath = "//b[contains(text(),'DOWNLOADS')]")
	WebElement download_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Blog')])[1]")
	WebElement blog_option;
	
	@FindBy(xpath = "(//b[contains(text(),'OUR BLOG')])[1]")
	WebElement blog_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Webinars')])[1]")
	WebElement webinars_option;
	
	@FindBy(xpath = "(//b[contains(text(),'WEBINARS')])[1]")
	WebElement webinar_title;
	
	@FindBy(xpath = "(//a[contains(text(),'Free eLearning Content')])[1]")
	WebElement elearning_option;
	
	@FindBy(xpath = "//b[contains(text(),'ELEARNING CONTENT')]")
	WebElement elearning_title;
	
	// pagefactory
	public Homepage(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,60);
		action = new Actions(driver);
	}
	
	public void getTitle()
	{
		String str = "Growth Engineering - Online Learning Engagement Experts";
		Assert.assertEquals(driver.getTitle(), str); //verfying the title of the page
	}
	
	public void all_menu_links()
	{
		Assert.assertTrue(logo.isDisplayed()); // logo
		Assert.assertTrue(OP.isDisplayed()); // Our Product menu link
		Assert.assertTrue(OA.isDisplayed()); // Our Approach menu link
		Assert.assertTrue(RS.isDisplayed()); //Resources menu link
		Assert.assertTrue(AU.isDisplayed()); // About US link
		Assert.assertTrue(GIT.isDisplayed()); // Get in touch button
	}
	
	public void our_products()
	{
		action.moveToElement(OP).moveToElement(KA).click(); // performing click action
	}
	
	public void knowledge_aracades_page() {
		wait.until(ExpectedConditions.visibilityOf(KAP));
		Assert.assertTrue(KAP.isDisplayed());  //verifying that element is present or not
	}
	
	public void click_genius_atho_tool()
	{
		action.moveToElement(OP).moveToElement(GAT).click();
	}
	
	public void genie_auth_title()
	{
		wait.until(ExpectedConditions.visibilityOf(GAT_title));
		Assert.assertTrue(GAT_title.isDisplayed());
	}
	public void click_academy_lms()
	{
		action.moveToElement(ALMS).moveToElement(ALMS).click();
	}
	
	public void academy_lms_title()
	{
		wait.until(ExpectedConditions.visibilityOf(ALMS_title));
		Assert.assertTrue(ALMS_title.isDisplayed());
	}
	
	public void click_brain_science()
	{
		action.moveToElement(OA).moveToElement(brain_science).click();
	}
	
	public void brain_science_title()
	{
		wait.until(ExpectedConditions.visibilityOf(brain_science_page));
		Assert.assertTrue(brain_science_page.isDisplayed());
	}
	
	public void click_social_learning()
	{
		action.moveToElement(OA).moveToElement(social_learning_option).click();
	}
	
	public void social_learning_title()
	{
		wait.until(ExpectedConditions.visibilityOf(social_learning_title));
		Assert.assertTrue(social_learning_title.isDisplayed());
	}
	
	public void click_gamification()
	{
		action.moveToElement(OA).moveToElement(gamification_option).click();
	}
	
	public void gamification_title()
	{
		wait.until(ExpectedConditions.visibilityOf(gamification_title));
		Assert.assertTrue(gamification_title.isDisplayed());
	}
	
	public void click_personalisation_option()
	{
		action.moveToElement(OA).moveToElement(personalisation_option).click();
	}
	
	public void personalise_title()
	{
		wait.until(ExpectedConditions.visibilityOf(personalise_option));
		Assert.assertTrue(personalise_option.isDisplayed());
	}
	
	public void click_downloads_option()
	{
		action.moveToElement(RS).moveToElement(downloads_option).click();
	}
	
	public void download_title()
	{
		wait.until(ExpectedConditions.visibilityOf(download_title));
		Assert.assertTrue(download_title.isDisplayed());
	}
	
	public void click_blog_option()
	{
		action.moveToElement(RS).moveToElement(blog_option).click();
	}
	
	public void blog_title()
	{
		wait.until(ExpectedConditions.visibilityOf(blog_title));
		Assert.assertTrue(blog_title.isDisplayed());
	}
	
	public void webinars_option()
	{
		action.moveToElement(RS).moveToElement(webinars_option).click();
	}
	
	public void webinar_title()
	{
		wait.until(ExpectedConditions.visibilityOf(webinar_title));
		Assert.assertTrue(webinar_title.isDisplayed());
	}
	
	public void elearning_option()
	{
		action.moveToElement(RS).moveToElement(elearning_option).click();
	}
	
	public void elearning_title()
	{
		wait.until(ExpectedConditions.visibilityOf(elearning_title));
		Assert.assertTrue(elearning_title.isDisplayed());
	}
	
	public void click_get_in_touch_button()
	{
		GIT.click();
	}
	

}
