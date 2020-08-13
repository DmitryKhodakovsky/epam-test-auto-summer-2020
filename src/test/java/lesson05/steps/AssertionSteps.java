package lesson05.steps;

import io.cucumber.java.en.Then;
import lesson05.cocntext.TestContext;
import lesson05.pages.YandexMarketComparePage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertionSteps {

    @Then("added products titles should be the same as displayed products on the Compare page")
    public void addedProductsTitlesShouldBeTheSameAsDisplayedProductsOnTheComparePage() {
        List<String> actualResults = new YandexMarketComparePage(TestContext.getInstance().getDriver()).getProductsTitles();
        List<String> expectedResults = TestContext.getInstance().getTestData();
        assertThat(actualResults).containsExactlyInAnyOrderElementsOf(expectedResults);
    }

}
