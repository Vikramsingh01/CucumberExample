package com.meganexus.utils;

import net.serenitybdd.core.pages.WebElementFacade;

public class GenericFunctions {
	public static void enterTxt(WebElementFacade element , String txt){
    	element.clear();
    	element.sendKeys(txt);
    }
	public static void click(WebElementFacade element){
		element.click();
	}
}
