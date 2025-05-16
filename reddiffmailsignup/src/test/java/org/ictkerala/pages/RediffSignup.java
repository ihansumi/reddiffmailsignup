package org.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffSignup {
	
	WebDriver driver;
	
	public RediffSignup(WebDriver driver) {
		
		this.driver=driver;
	}
	//Verify the url
	public String verifyPage() {
		String act_url=driver.getCurrentUrl();
		return act_url;
	}
	//verify get a new rediff emailid test for creating new account
	public String versignupText() {
		WebElement signupbutt=driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
		String act_text=signupbutt.getText();
		return act_text;
	}
	public void buttonclick() {
		WebElement signupbuttclk=driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
		signupbuttclk.click();
	}
	public void fullnamefield(String fname) {
		WebElement  fullname=driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
		fullname.sendKeys(fname);
	}
	public void reddiffmailid(String email) {
		WebElement emailid=driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
		emailid.sendKeys(email);
	}
	public String checkavailability() {
		WebElement available=driver.findElement(By.xpath("//input[@value='Check availability']"));
		available.click();
		WebElement resultMsg = driver.findElement(By.xpath("//div[@style='display: block;']"));
		String real_msg=resultMsg.getText();
		return real_msg;
	}
	public void choosePassword(String pass) {
		WebElement chosepasswd=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		chosepasswd.sendKeys(pass);
	}
	public void retypepass(String repass) {
		WebElement retype=driver.findElement(By.xpath("//input[@placeholder='Retype password']"));
		retype.sendKeys(repass);
	}
	public void dateofBirth() {
		WebElement daybirth=driver.findElement(By.xpath("//select[@class='day']/option[@value=06]"));
		daybirth.click();
		WebElement mobirth=driver.findElement(By.xpath("//select[@class='middle month']/option[@value=04]"));
		mobirth.click();
		WebElement yearob=driver.findElement(By.xpath("//select[@class='year']/option[@value='2010']"));
		yearob.click();
	}
	public void gender() {
		WebElement genderselect=driver.findElement(By.xpath("//input[@type='radio' and starts-with(@name, 'gender') and @value='f']"));
		genderselect.click();
	}
	public void countrySelect() {
		WebElement country=driver.findElement(By.xpath("//select[@id='country']/option[@label='Argentina']"));
		country.click();
	}
	public void recoveremail(String remail) {	
		
		WebElement recover=driver.findElement(By.xpath("//input[@placeholder='Enter recovery email']"));
		recover.sendKeys(remail);
		}
	public void norecoveremail()	
		{
			WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and starts-with(@name,'chk_altemail')]"));
			checkbox.click();
		}
	public void mobilenumber(String mob) {
		/*WebElement Argent=driver.findElement(By.xpath("//li[contains(@onclick, 'selectValue') and contains(text(), 'Antarctica')]"));
		Argent.click();*/
		WebElement mobilenum=driver.findElement(By.xpath("//input[starts-with(@name,'mobno')]"));
		mobilenum.sendKeys(mob);
	}
	public void securityQuestion(String school) {
		WebElement security=driver.findElement(By.xpath("//option[@label='What is the name of your first school?']"));
		security.click();
		WebElement answer=driver.findElement(By.xpath("//input[@type='password' and starts-with(@name,'hint') ]"));
		answer.sendKeys(school);
	}
	public void maidenane(String mname) {
		WebElement mother=driver.findElement(By.xpath("//input[starts-with(@name,'mothername')]"));
		mother.sendKeys(mname);
	}
	public void createAcc() {
		WebElement submit=driver.findElement(By.xpath("//input[@id='Register']"));
		submit.click();
	}
}	
	


