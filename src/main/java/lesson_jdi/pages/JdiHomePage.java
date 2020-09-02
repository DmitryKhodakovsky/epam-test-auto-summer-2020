package lesson_jdi.pages;

import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

public class JdiHomePage extends WebPage {

    @FindBy(css = ".benefit")
    public WebList benefit;

    public int getBenefitsCount() {
        // [auto_id='%s']
        return benefit.size();
    }
}
