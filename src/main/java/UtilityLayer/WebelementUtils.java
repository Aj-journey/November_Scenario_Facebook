package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebelementUtils extends BaseClass{

	public static void sendkeys(WebElement wb,String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static void radioHandle(List<WebElement> rdlist,String value)
	{
		for(WebElement wb:rdlist)
		{
			String text=wb.getText();
			if(text.contains(value))
			{
				WebelementUtils.click(wb);
				break;
			}
		}
	}
}
