package lesson05.cocntext;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TestContext {

    private static TestContext instance;

    private WebDriver driver;

    private List<String> testData = new ArrayList<>();

    private TestContext() {
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getTestData() {
        return testData;
    }

    public void setTestData(List<String> testData) {
        this.testData = testData;
    }

    public static TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }
        return instance;
    }
}
