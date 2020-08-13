package lesson05.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YandexMarketCategoryPage {

    @FindBy(xpath = "//div[@data-zone-name='link']")
    private List<WebElement> leftSideMenuItems;

    public YandexMarketCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickLeftSideMenuItem(String itemName) {
        for (WebElement leftSideMenuItem : leftSideMenuItems) {
            if (leftSideMenuItem.getText().trim().equalsIgnoreCase(itemName)) {
                leftSideMenuItem.click();
                break;
            }
        }
    }
}
