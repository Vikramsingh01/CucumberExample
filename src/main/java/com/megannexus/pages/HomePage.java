package com.megannexus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.meganexus.pojo.Customer;
import com.meganexus.utils.ConfigFileReader;

 
public class HomePage {
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	public void perform_Search(String search) {
		driver.navigate().to(configFileReader.getApplicationUrl() + "/?s=" + search + "&post_type=product");
	}
	
	public void navigateTo_HomePage() {
		driver.get(configFileReader.getApplicationUrl());
	}
	public void fill_PersonalDetails(Customer customer) {
		showData(customer.firstName);
		showData(customer.lastName);
		showData(customer.phoneNumber.mob);
		showData(customer.emailAddress);
		showData(customer.address.city);
		showData(customer.address.streetAddress);
		showData(customer.address.postCode);
		showData(customer.address.country);
		showData(customer.address.county);		
	}

	private void showData(String data) {
		System.out.println("~~~~~~~~~  "+ data +"  ~~~~~~~~");
		
	}
}