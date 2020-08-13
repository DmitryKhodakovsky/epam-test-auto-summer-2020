package lesson05.steps;

import io.cucumber.java.en.Given;
import lesson05.cocntext.TestContext;
import lesson05.pages.YandexMarketCategoryPage;
import lesson05.pages.YandexMarketMainPage;

public class ModelSteps {

    @Given("I open main Yandex Market page")
    public void i_open_main_Yandex_Market_page() {
        new YandexMarketMainPage(TestContext.getInstance().getDriver()).open();
    }

    @Given("I navigate to {string} in header menu on the Yandex Market page")
    public void i_navigate_to_in_header_menu_on_the_Yandex_Market_page(String category) {
        new YandexMarketMainPage(TestContext.getInstance().getDriver()).clickHeaderMenuItem(category);
    }

    @Given("I navigate to {string} in the Left Side menu on the Yandex Market Category page")
    public void i_navigate_to_in_the_Left_Side_menu_on_the_Yandex_Market_Category_page(String subCategory) {
        new YandexMarketCategoryPage(TestContext.getInstance().getDriver()).clickLeftSideMenuItem(subCategory);
    }

}
