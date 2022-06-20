package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class RadioButtonPage extends BasePage {

  Actions act = new Actions(getDriver());

  private By yesRadioButton = By.id("yesRadio");
  private By impressiveRadioButton = By.id("impressiveRadio");

  private By messageAfterClickingButton = By.className("mt-3");

  public RadioButtonPage(WebDriver driver, WebDriverWait driverWait) {

    super(driver, driverWait);
  }

  /**
   * Verifies that confirmation message is displayed
   * with Radio Button name in it.
   * @param inMessage
   * @return true if element is displayed and contains Radio Button name.
   */
  public boolean isConfirmationMessageThere(String inMessage) {

    WebElement element = getDriver().findElement(messageAfterClickingButton);

    return element.isDisplayed() && element.getText().contains(inMessage);
  }

  /**
   * Verifies that "Yes" button is selected and "Impressive" is not.
   * @return true if "Yes" button is selected and "Impressive" is not
   * and confirmation message is displayed.
   */
  public boolean verifyYesRadioButtonSelection() {

    act.click(getDriver().findElement(yesRadioButton)).perform();

    return !getDriver().findElement(impressiveRadioButton).isSelected() &&
            getDriver().findElement(yesRadioButton).isSelected() &&
            isConfirmationMessageThere("Yes");
  }

  /**
   * Verifies that "Impressive" button is selected and "Yes" is not.
   * @return true if "Impressive" button is selected and "Yes" is not
   * and confirmation message is displayed.
   */
  public boolean verifyImpressiveRadioButtonSelection() {

    act.click(getDriver().findElement(impressiveRadioButton)).perform();

    return !getDriver().findElement(yesRadioButton).isSelected() &&
            getDriver().findElement(impressiveRadioButton).isSelected() &&
            isConfirmationMessageThere("Impressive");
  }
}