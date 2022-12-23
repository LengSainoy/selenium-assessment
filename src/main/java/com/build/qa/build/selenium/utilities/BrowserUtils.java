package com.build.qa.build.selenium.utilities;

import com.build.qa.build.selenium.framework.BaseFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BrowserUtils extends BaseFramework{
  public WebElement waitForElementToPresent(By locator) {
    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
  }
}
