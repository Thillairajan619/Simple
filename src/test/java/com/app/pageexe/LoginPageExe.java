package com.app.pageexe;

import org.junit.Assert;

import com.app.base.BaseClass;
import com.app.locators.LoginPageLocators;

public class LoginPageExe extends LoginPageLocators {

	/*
	 * public static void username() {
	 * BaseClass.sendkeys(BaseClass.findElementid(LoginPageLocators.username),
	 * "Kalarani"); }
	 */
	// Abstarct method
		public static void username(String user) {
			BaseClass.sendkeys(BaseClass.findElementBy(LoginPageLocators.username),user );

		}

	public static void password(String pass) {
		BaseClass.sendkeys(BaseClass.findElementid(LoginPageLocators.password), pass);
		
	}

	public static void loginbutton() {
		BaseClass.clickdata(BaseClass.findElementid(LoginPageLocators.loginbutton));
		
	}


}
