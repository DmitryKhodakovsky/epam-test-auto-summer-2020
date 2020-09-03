package lesson_jdi;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.jdi.tools.Timer;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static lesson_jdi.JdiSite.*;
import static lesson_jdi.entities.User.*;

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

        open();
        int actualCount = jdiHomePage.getBenefitsCount();


        jdiHomePage.benefit.is().size(EXPECTED_BENEFITS_COUNT);
//        assertEquals(actualCount, EXPECTED_BENEFITS_COUNT,
//                format("Expected benefits count is %s but get %s", EXPECTED_BENEFITS_COUNT, actualCount));
    }

    @Test
    public void loginTest() {

        Timer.waitCondition(() -> {
            return true;
        });

        //1. Open JDI site
        open();
        //2. Login as user Roman:Jdi1234
        login(ROMAN);
        //3. Check that user name is Roman Iovlev
        jdiHomePage.checkUserLoggedIn(ROMAN);


//        JdiSite.login("Roman", "Jdi1234");
//        jdiHomePage.userName.is()
//                .text(ROMAN.getFullName());
//        String actualFullName = getUserName();
//        Assert.assertEquals(actualFullName, User.ROMAN.getFullName());
    }
}
