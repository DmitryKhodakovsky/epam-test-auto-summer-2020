package context.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({FailListener.class})
public class SampleTest extends AbstractBaseTest {

    @Test
    public void testName() {
        driver.findElement(By.partialLinkText("jdjjddjdj")).click();
    }
}
