package test;

import org.openqa.selenium.WebDriver;

import pages.Contactpage;
import pages.Homepage;



public class CreateInstance {
	CreateInstance(){}
	private Homepage hp;
	private Contactpage cp;
	
	public Homepage GetHomepageInstance(WebDriver driver) {		
		if(hp == null)
			return hp = new Homepage(driver);
		else
			return hp;
	}
	
	public Contactpage GetContactpageInstance(WebDriver driver) {		
		if(cp == null)
			return cp = new Contactpage(driver);
		else
			return cp;
	}


}
