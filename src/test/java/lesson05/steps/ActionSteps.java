package lesson05.steps;

import io.cucumber.java.en.When;
import lesson05.cocntext.TestContext;
import lesson05.pages.YandexMarketCatalogPage;

public class ActionSteps {

//    @When("I add {int}-(:?st|nd|rd|th) product to compare list from the product list on the Catalog Yandex market page")
    @When("I add {int} st/nd/rd/th product to compare list from the product list on the Catalog Yandex market page")
    public void i_add_st_product_to_compare_list_from_the_product_list_on_the_Catalog_Yandex_market_page(Integer index) {
        new YandexMarketCatalogPage(TestContext.getInstance().getDriver())
                .addToCompareList(index - 1);
        TestContext.getInstance().getTestData().add(new YandexMarketCatalogPage(TestContext.getInstance().getDriver())
                .getProductName(index - 1));
    }

    @When("I click 'Сравнить' button on the Catalog Yandex market page")
    public void i_click_button_on_the_Catalog_Yandex_market_page() {
        new YandexMarketCatalogPage(TestContext.getInstance().getDriver()).clickToCompareButton();
    }
}
