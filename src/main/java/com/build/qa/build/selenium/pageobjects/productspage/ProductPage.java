package com.build.qa.build.selenium.pageobjects.productspage;

import com.build.qa.build.selenium.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class ProductPage extends BasePage {

  public ProductPage(WebDriver driver, Wait<WebDriver> wait) {
    super(driver, wait);
  }

  @FindBy(css = "h2.product__brand")
  public WebElement productBrand;
  @FindBy(css = "[itemprop='productID']")
  public WebElement productId;
}
