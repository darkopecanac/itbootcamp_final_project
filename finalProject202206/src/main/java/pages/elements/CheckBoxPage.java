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

  public CheckBoxPage(WebDriver driver, WebDriverWait webDriverWait) {

    super(driver, webDriverWait);
  }

  public void checkHomeCheckBox() {

    getDriver().findElement(homeCheckBox).click();
  }

  public void checkPrivateCheckBox() {

    getDriver().findElement(expandAll).click();
    getDriver().findElement(privateCheckBox).click();
  }

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

  public boolean verifyPrivateCheckBoxesSelection() {

    String expectedString = "private";
    String actualString = "";

    checkPrivateCheckBox();

    actualString = getDriver().findElement(By.className("text-success")).getText();

    return actualString.equals(expectedString);
  }
}