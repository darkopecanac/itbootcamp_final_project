package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class ElementsPage extends BasePage {
  public ElementsPage(WebDriver driver, WebDriverWait webDriverWait) {
    super(driver, webDriverWait);
  }

  public void selectTexBox() {
    getDriver().findElement(By.id("item-0")).click();
  }

  public void selectCheckBox() {
    getDriver().findElement(By.id("item-1")).click();
  }
}