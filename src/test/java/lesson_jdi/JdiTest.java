package lesson_jdi;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JdiTest {

    public static final int EXPECTED_BENEFITS_COUNT = 3;

    @BeforeSuite
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
    }

    @AfterSuite
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

    @Test
    public void benefitsCountTest() {
        /*
        1. Open index page
        2. Benefits count should be 4
         */

        JdiSite.open();
        int actualCount = JdiSite.jdiHomePage.getBenefitsCount();


        JdiSite.jdiHomePage.benefit.is().size(EXPECTED_BENEFITS_COUNT);
//        assertEquals(actualCount, EXPECTED_BENEFITS_COUNT,
//                format("Expected benefits count is %s but get %s", EXPECTED_BENEFITS_COUNT, actualCount));
    }
}
