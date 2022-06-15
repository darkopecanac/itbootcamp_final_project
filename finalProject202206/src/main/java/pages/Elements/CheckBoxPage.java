package pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.util.List;

public class CheckBoxPage extends BasePage {

  By homeCheckBox = By.xpath("//*[@id='tree-node']/ol/li/span/label");

  public CheckBoxPage(WebDriver driver, WebDriverWait webDriverWait) {
    super(driver, webDriverWait);
  }

  public void checkHomeCheckBox() {
    getDriver().findElement(homeCheckBox).click();
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
}