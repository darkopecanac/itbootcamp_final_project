package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.List;

public class CheckBoxPage extends BasePage {

  private By homeCheckBox = By.xpath("//*[@id='tree-node']/ol/li/span/label");
  private By expandAll = By.xpath("//*[@id='tree-node']/div/button[1]");
  private By privateCheckBox = By.xpath(
  "//*[@id='tree-node']/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]");

  public CheckBoxPage(WebDriver driver, WebDriverWait driverWait) {

    super(driver, driverWait);
  }

  /**
   * Checks Home check box and all sub-check boxes.
   */
  public void checkHomeCheckBox() {

    getDriver().findElement(homeCheckBox).click();
  }

  /**
   * Checks Private, only one of sub-check boxes.
   */
  public void checkPrivateCheckBox() {

    getDriver().findElement(expandAll).click();
    getDriver().findElement(privateCheckBox).click();
  }

  /**
   * Verifies that all check boxes are selected.
   * @return true if all check boxes are selected.
   */
  public boolean verifyAllCheckBoxesSelection() {

    String expectedString = "home desktop notes commands documents workspace react angular " +
            "veu office public private classified general downloads wordFile excelFile";
    String actualString = "";

    checkHomeCheckBox();

    List<WebElement> selectedCheckBoxes = getDriver().findElements(By.className("text-success"));
    for ( WebElement element : selectedCheckBoxes ) {
      actualString += element.getText() + " ";
    }

    return actualString.contains(expectedString);
  }

  /**
   * Verifies that only Private check box is selected.
   * @return true if only Private check box is selected.
   */
  public boolean verifyPrivateCheckBoxesSelection() {

    String expectedString = "private";
    String actualString = "";

    checkPrivateCheckBox();

    actualString = getDriver().findElement(By.className("text-success")).getText();

    return actualString.equals(expectedString);
  }
}