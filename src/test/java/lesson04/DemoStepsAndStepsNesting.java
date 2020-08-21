package lesson04;

import io.qameta.allure.Description;
import lesson04.utils.AttachmentUtils;
import lesson04.utils.LoginUtils;
import lesson04.utils.PasswordStrengthValidationUtils;
import lombok.SneakyThrows;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class DemoStepsAndStepsNesting {

    public static final String CAT_URL =
            "https://upload.wikimedia.org/wikipedia/commons/b/b6/Felis_catus-cat_on_snow.jpg";

    @BeforeMethod
    public void setUp(ITestContext context) {
        LoginUtils.loginWithDefaultUser();
        context.setAttribute("driver", "some driverText");
    }

    @Test
    public void testLogout() {
        LoginUtils.logout();
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void nullUserExceptionExpected() {
        LoginUtils.login(null);
    }

    @Test(expectedExceptions = NullPointerException.class)
    @Description("Lets try to expect wrong exception")
    @Ignore
    public void testEmptyUser() {
        LoginUtils.login(LoginUtils.EMPTY_USER);
    }

    @Test
    @Ignore
    public void test2x2is5() {
        assertEquals(2 * 2, 5);
    }

    @Test
    public void testDescriptionForCollectionParamsAndAttachments() {
        List<String> input = Arrays.asList("a", "aA", "aA9");
        AttachmentUtils.makeStringAttachment(input);

        List<String> actual = PasswordStrengthValidationUtils.filterBadPasswords(input);
        List<String> expected = Collections.singletonList("aA9");

        attachCatPicture();
        assertEquals(actual, expected);
    }

    @SneakyThrows
    private void attachCatPicture() {
        try (InputStream is = new URL(CAT_URL).openStream()) {
            AttachmentUtils.attachFromInputStream("Everybody loves cat", is);
        }
    }

}
