package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class ButtonsPage extends BasePage {

  Actions act = new Actions(getDriver());

  private By doubleClickMeButton = By.id("doubleClickBtn");
  private By rightClickMeButton = By.id("rightClickBtn");
  private By dynamicClickMeButton = By.xpath("//button[text()='Click Me']");

  private By doubleClickMessage = By.id("doubleClickMessage");
  private By rightClickMessage = By.id("rightClickMessage");
  private By dynamicClickMessage = By.id("dynamicClickMessage");

  public ButtonsPage(WebDriver driver, WebDriverWait driverWait) {

    super(driver, driverWait);
  }

  /**
   * Verifies that after double-click on the button there is a message displayed.
   * @return true if a message is displayed.
   */
  public boolean verifyDoubleClickMeButton() {

    act.doubleClick(getDriver().findElement(doubleClickMeButton)).perform();

    return getDriver().findElement(doubleClickMessage).getText()
            .equals("You have done a double click");

  }

  /**
   * Verifies that after right-click on the button there is a message displayed.
   * @return true if a message is displayed.
   */
  public boolean verifyRightClickMeButton() {

    act.contextClick(getDriver().findElement(rightClickMeButton)).perform();

    return getDriver().findElement(rightClickMessage).getText()
            .equals("You have done a right click");
  }

  /**
   * Verifies that after click on the button with dynamically changed id
   * there is a message displayed.
   * @return true if a message is displayed.
   */
  public boolean verifyDynamicClickMeButton() {

    act.click(getDriver().findElement(dynamicClickMeButton)).perform();

    return getDriver().findElement(dynamicClickMessage).getText()
            .equals("You have done a dynamic click");
  }
}