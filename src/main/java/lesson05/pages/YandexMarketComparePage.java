package lesson05.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class YandexMarketComparePage {

    @FindBy(xpath = "//img/..//a[contains(@class, 'cia-cs')]")
    private List<WebElement> productsList;

    public YandexMarketComparePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<String> getProductsTitles() {
        return productsList
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
