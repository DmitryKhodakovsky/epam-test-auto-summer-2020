package lesson_jdi.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Icon;
import lesson_jdi.entities.User;
import lesson_jdi.forms.LoginForm;

public class JdiHomePage extends WebPage {

    @FindBy(css = ".benefit")
    public WebList benefit;

    @FindBy(id = "user-name")
    public Label userName;

    public LoginForm loginForm;

    @FindBy(id = "user-icon")
    public Icon userIcon;

    public int getBenefitsCount() {
        // [auto_id='%s']
        return benefit.size();
    }

    public void login(User user) {
        userIcon.click();
        loginForm.login(user);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void checkUserLoggedIn(User user) {
        userName.is().text(user.getFullName());
        userName.waitFor(10).text(user.getFullName());
        userName.is().enabled().and().displayed();
    }
}
