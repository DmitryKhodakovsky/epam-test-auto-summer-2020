package lesson05.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YandexMarketMainPage {

    private WebDriver driver;

    @FindBy(xpath = "//div[@data-zone-name='category-link']")
    private List<WebElement> headerMenuItems;

    public YandexMarketMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://market.yandex.ru/");
    }

    public void clickHeaderMenuItem(String itemName) {
        for (WebElement headerMenuItem : headerMenuItems) {
            if (headerMenuItem.getText().trim().equalsIgnoreCase(itemName)) {
                headerMenuItem.click();
                break;
            }
        }
    }
}
