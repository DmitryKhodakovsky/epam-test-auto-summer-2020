package lesson05.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class YandexMarketCatalogPage {

    private WebDriver driver;

    @FindBy(css = "article[data-zone-name='snippet-card']")
    private List<WebElement> productCardList;

    public YandexMarketCatalogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCompareList(int index) {
        WebElement addToCompareButton = productCardList.get(index)
                .findElement(By.xpath("div[2]/div[contains(@aria-label, 'Добавить')]"));
        Actions actions = new Actions(driver);
        actions
                .moveToElement(addToCompareButton)
                .click(addToCompareButton)
                .build()
                .perform();
    }

    public String getProductName(int index) {
        return productCardList.get(index).findElement(By.cssSelector("[data-zone-name='title']")).getText().trim();
    }

    public void clickToCompareButton() {
        new WebDriverWait(driver, 15)
                .until(elementToBeClickable(By.partialLinkText("Сравнить")))
                .click();
    }
}
