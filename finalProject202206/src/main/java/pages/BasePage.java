package pages;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
public class BasePage {

  private WebDriver driver;
  private WebDriverWait driverWait;

  private final String HOME_URL = "https://demoqa.com/";

  public BasePage(WebDriver driver, WebDriverWait driverWait) {

    this.driver = driver;
    this.driverWait = driverWait;
  }

  /**
   * Opens Home page
   */
  public void openHomePage() {

    driver.navigate().to(HOME_URL);
  }

  /**
   * Refreshes page
   */
  public void refreshPage() {

    driver.navigate().refresh();
  }
}