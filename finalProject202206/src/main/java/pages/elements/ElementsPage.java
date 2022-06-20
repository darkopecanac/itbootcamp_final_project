package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class ElementsPage extends BasePage {

  public ElementsPage(WebDriver driver, WebDriverWait driverWait) {

    super(driver, driverWait);
  }

  /**
   * In Elements section selects Text Box sub-section.
   */
  public void selectTexBoxSubSection() {

    getDriver().findElement(By.id("item-0")).click();
  }

  /**
   * In Elements section selects Check Box sub-section.
   */
  public void selectCheckBoxSubSection() {

    getDriver().findElement(By.id("item-1")).click();
  }

  /**
   * In Elements section selects Radio Button sub-section.
   */
  public void selectRadioButtonSubSection() {

    getDriver().findElement(By.id("item-2")).click();
  }

  /**
   * In Elements section selects Web Tables sub-section.
   */
  public void selectWebTablesSubSection() {

    getDriver().findElement(By.id("item-3")).click();
  }

  /**
   * In Elements section selects Buttons sub-section.
   */
  public void selectButtonsSubSection() {

    getDriver().findElement(By.id("item-4")).click();
  }
}