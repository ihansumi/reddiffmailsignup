package org.ictkerala.testcases;

import org.ictkerala.base.InitialSettings;
import org.ictkerala.pages.RediffSignup;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RediffTestCases extends InitialSettings {
	
	RediffSignup lobj;
	
	@BeforeClass
	
	public void initobj() {
		lobj=new RediffSignup(driver);
	}
	@Test
	public void TC_001() {
		String actual=lobj.verifyPage();
		Assert.assertEquals(actual, Constants.Expected_url);
	}
	@Test
	public void TC_002() {
		String act_textmsg=lobj.versignupText();
		Assert.assertEquals(act_textmsg, Constants.Expected_text);
		lobj.buttonclick();
	}
	@Test
	public void TC_003() {
		lobj.fullnamefield("Sumi Sunny");
		lobj.reddiffmailid("sumisunny255");
	}
	@Test
	public void TC_004(){
		String avail=lobj.checkavailability();
		if(avail.equals(Constants.Expected_message)) {
			System.out.println("Yippie! The ID you've chosen is available.");
			}
		else {
				System.out.println("Email id not available");
			}
		}
	@Test
	public void TC_005() {
		lobj.choosePassword("Jesusmary@123");
		lobj.retypepass("Jesusmary@123");
	}
	@Test
	public void TC_006() {
		lobj.dateofBirth();
	}
	@Test
	public void TC_007() {
		lobj.gender();
	}
	@Test
	public void TC_008() {
		lobj.countrySelect();
		lobj.recoveremail("sumisunny1988@gmail.com");
	}
	@Test
	public void TC_009() {
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		lobj.fullnamefield("Divya Sunny");
		lobj.reddiffmailid("sumisunny255");
		lobj.checkavailability();
		lobj.choosePassword("Jesusmary@123");
		lobj.retypepass("Jesusmary@123");
		lobj.dateofBirth();
		lobj.gender();
		lobj.countrySelect();
		lobj.norecoveremail();
	}
	@Test
	public void TC_010() {
		lobj.securityQuestion("Infant Jesus EMS");
	}
	
	@Test
	public void TC_011() {
		lobj.mobilenumber("65478909833");
	}
	@Test
	public void TC_012() {
		lobj.maidenane("Molly Sunny");
	}
	}

