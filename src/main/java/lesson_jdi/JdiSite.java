package lesson_jdi;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import lesson_jdi.entities.User;
import lesson_jdi.pages.JdiHomePage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    @Url("index.html")
    public static JdiHomePage jdiHomePage;

    public static void open() {
        jdiHomePage.open();
    }

    public static void login(User user) {
        jdiHomePage.login(user);
    }

    public static String getUserName() {
        return jdiHomePage.getUserName();
    }
}
