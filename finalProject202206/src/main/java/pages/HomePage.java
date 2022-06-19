package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public class HomePage extends BasePage {

  private By elements = By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]");
  private By forms = By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]");
  private By alertsFrameWindows = By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]");
  private By widgets = By.xpath("//*[@id='app']/div/div/div[2]/div/div[4]");
  private By interactions = By.xpath("//*[@id='app']/div/div/div[2]/div/div[5]");
  private By bookStoreApplication = By.xpath("//*[@id='app']/div/div/div[2]/div/div[6]");
  private By headerOfSection = By.xpath("//*[@id='app']/div/div/div[1]/div");
//  private String sectionURL = getDriver().getCurrentUrl();

  public HomePage(WebDriver driver, WebDriverWait driverWait) {
    super(driver, driverWait);
  }

  public void openSection(By element) {
    getDriver().findElement(element).click();
  }

  public boolean verifyOpenedSection(By element) {

    String elementString = getDriver().findElement(element).getText();
    System.out.println(elementString);

    openSection(element);

    switch ( elementString ) {
      case "Elements":
        return  ( getDriver().findElement(headerOfSection).getText().equals("Elements") &&
                getDriver().getCurrentUrl().equals("https://demoqa.com/elements") );
      case "Forms":
        return  ( getDriver().findElement(headerOfSection).getText().equals("Forms") &&
                getDriver().getCurrentUrl().equals("https://demoqa.com/forms") );
      case "Alerts, Frame & Windows":
        return  ( getDriver().findElement(headerOfSection).getText().equals("Alerts, Frame & Windows") &&
                getDriver().getCurrentUrl().equals("https://demoqa.com/alertsWindows") );
      case "Widgets":
        return  ( getDriver().findElement(headerOfSection).getText().equals("Widgets") &&
                getDriver().getCurrentUrl().equals("https://demoqa.com/widgets") );
      case "Interactions":
        return  ( getDriver().findElement(headerOfSection).getText().equals("Interactions") &&
                getDriver().getCurrentUrl().equals("https://demoqa.com/interaction") );
      case "Book Store Application":
        return  ( getDriver().findElement(headerOfSection).getText().equals("Book Store") &&
                getDriver().getCurrentUrl().equals("https://demoqa.com/books") );
      default:
        return false;
    }
  }

//  public void openElementsSection() {
//    getDriver().findElement(elements).click();
//  }
//
//  public void openFormsSection() {
//    getDriver().findElement(forms).click();
//  }
//
//  public void openAlertsFrameWindowsSection() {
//    getDriver().findElement(alertsFrameWindows).click();
//  }
//  public void openWidgetsSection() {
//    getDriver().findElement(widgets).click();
//  }
//  public void openInteractionsSection() {
//    getDriver().findElement(interactions).click();
//  }
//  public void openBookStoreApplicationSection() {
//    getDriver().findElement(bookStoreApplication).click();
//  }
}