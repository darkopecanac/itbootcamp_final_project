package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

  By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");
  By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
  By alertsFrameWindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
  By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
  By interactions = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
  By bookStoreApplication = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");

  public HomePage(WebDriver driver, WebDriverWait driverWait) {
    super(driver, driverWait);
  }

  public void openElementsSection() {
    getDriver().findElement(elements).click();
  }

  public void selectTexBox() {
//    getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("item-0")));
    getDriver().findElement(By.id("item-0")).click();
  }

  public void selectCheckBox() {
    getDriver().findElement(By.id("item-1")).click();
  }

  public void openFormsSection() {
    getDriver().findElement(forms).click();
  }

  public void openAlertsFrameWindowsSection() {
    getDriver().findElement(alertsFrameWindows).click();
  }
  public void openWidgetsSection() {
    getDriver().findElement(widgets).click();
  }
  public void openInteractionsSection() {
    getDriver().findElement(interactions).click();
  }
  public void openBookStoreApplicationSection() {
    getDriver().findElement(bookStoreApplication).click();
  }
}