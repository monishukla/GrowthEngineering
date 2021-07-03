package test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gluecode {
	public WebDriver driver;
	public Properties pro;
	public Scenario s;
	private CreateInstance cin;
	
@Before
  public void method1(Scenario x) throws Exception
  {
	this.s=x;
   // pro = new Properties();
    String path = System.getProperty("user.dir");
    //FileInputStream fip = new FileInputStream(path + "\\src\\test\\java\\test\\Properties.properties");
   // pro.load(fip);
    //String path = System.getProperty("user.dir");
    String driverpath = path + "\\src\\test\\java\\driver\\chromedriver_win32 (1)\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",driverpath );   
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized"); // open Browser in maximized mode
    options.addArguments("disable-infobars"); // disabling infobars
    options.addArguments("--disable-extensions"); // disabling extensions
    options.addArguments("--disable-gpu"); // applicable to windows os only
    options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
    options.addArguments("--no-sandbox"); // Bypass OS security model
    //WebDriver driver = new ChromeDriver(options);
    driver = new ChromeDriver(options);
    //lp = new Loginpage(driver);
   
    driver.manage().window().maximize();  //maximize the browser
    cin = new CreateInstance();  // create the instance of CreateInstance class
}

@Given ("^launch the site$")
public void launch_current_site()
{
	driver.get("https://www.growthengineering.co.uk/"); // launch the url
}

@Then ("^lands on home page$")
public void lands_on_home_page()
{
	cin.GetHomepageInstance(driver).getTitle();
}

@And ("^verify that all menu link should present$")
public void all_menu_links()
{
	cin.GetHomepageInstance(driver).all_menu_links();
}

@When ("^click on Knwledge Arcades under Our Products menu link$")
public void click_knowledge_aracdes()
{
	cin.GetHomepageInstance(driver).our_products();
}

@Then ("^lands knowledge Arcades page$")
public void knowledge_arcades_page()
{
	cin.GetHomepageInstance(driver).knowledge_aracades_page();
}

@When ("^click on Genie Authoring Tool$")
public void click_genie_authoring_tool()
{
	cin.GetHomepageInstance(driver).click_genius_atho_tool();
}

@Then ("^lands on Genie Authoring Tool page$")
public void genie_auth_title()
{
	cin.GetHomepageInstance(driver).genie_auth_title();
}

@When ("^click on The Academy LMS option$")
public void click_academy_lms()
{
	cin.GetHomepageInstance(driver).click_academy_lms();
}

@Then ("^lands on The Academy LMS page$")
public void academy_lms_title()
{
	cin.GetHomepageInstance(driver).academy_lms_title();
}

@When ("^click on Brain Science under Our Aproach menu link$")
public void click_brain_science()
{
	cin.GetHomepageInstance(driver).click_brain_science();
}

@Then ("^lands on Brain Science page$")
public void brain_science_page()
{
	cin.GetHomepageInstance(driver).brain_science_title();
}

@When ("^user click on Social Learning option$")
public void click_social_learning_option()
{
	cin.GetHomepageInstance(driver).click_social_learning();
}

@Then ("^lands on Social learning page$")
public void social_learning_pag()
{
	cin.GetHomepageInstance(driver).social_learning_title();
}

@When ("^user click on Gamification option$")
public void click_gamification_option()
{
	cin.GetHomepageInstance(driver).click_gamification();
}

@Then ("^user lands on Gamification page$")
public void gamification_title()
{
	cin.GetHomepageInstance(driver).gamification_title();
}

@When ("^user click on Personalisation option$")
public void click_personalisation_option()
{
	cin.GetHomepageInstance(driver).click_personalisation_option();
}

@Then ("^user lands on Personalisation$")
public void personalisation_title()
{
	cin.GetHomepageInstance(driver).personalise_title();
}

@When ("^click on Downloads under Resources menu link$")
public void click_downloads_option()
{
	cin.GetHomepageInstance(driver).click_downloads_option();
}

@Then ("^lands on Download page$")
public void download_title()
{
	cin.GetHomepageInstance(driver).download_title();
}

@When ("^user click on Blog option$")
public void click_blog_option()
{
	cin.GetHomepageInstance(driver).click_blog_option();
}

@Then ("^lands on Blog page$")
public void blog_title()
{
	cin.GetHomepageInstance(driver).blog_title();
}

@When ("^user click on Webinar$")
public void click_webinars_option()
{
	cin.GetHomepageInstance(driver).webinars_option();
}

@Then ("^lands on Webinar page$")
public void webinars_title()
{
	cin.GetHomepageInstance(driver).webinar_title();
}

@When ("^user on elearnig content$")
public void elearning_content_option()
{
	cin.GetHomepageInstance(driver).elearning_option();
}

@Then ("^lands on elearning content page$")
public void elearning_content_title()
{
	cin.GetHomepageInstance(driver).elearning_title();
}

@When ("^click on GET IN TOUCH button$")
public void click_get_in_touch_button()
{
	cin.GetHomepageInstance(driver).click_get_in_touch_button();
}

@And ("^click on click on submit$")
public void click_submit_button()
{
	cin.GetContactpageInstance(driver).click_submit_button();
}

@Then ("^lands on Contact page$")
public void contact_page_title()
{
	cin.GetContactpageInstance(driver).contact_page_title();
}

@Then ("^verify that Please complete all required fields text should display$")
public void validation_display()
{
	cin.GetContactpageInstance(driver).validation_displays();
}

@And ("^close the browser$")
public void close_browser() throws InterruptedException
{
	Thread.sleep(2000);  // wait for 2 sec
	driver.quit();
}






}
