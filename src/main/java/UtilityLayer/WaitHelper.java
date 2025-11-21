package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitHelper extends BaseClass {

	public static WebElement visiblityOf(WebElement wb)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}
}
