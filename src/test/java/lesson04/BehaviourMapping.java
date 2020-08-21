package lesson04;

import io.qameta.allure.*;
import lesson04.storynames.Epics;
import lesson04.storynames.Features;
import lesson04.storynames.Stories;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

@Epic(Epics.FirstBigEpic)
public class BehaviourMapping {
    @Test
    @Feature(Features.LOGIN)
    @Story(Stories.DEFAULT_LOGIN)
    @Story(Stories.LOGOUT)
    @Owner("Bob Ivanovich")
    public void testAlpha() {
        step("step");
    }

    @Test
    @Feature(Features.GET_QUESTION_LIST)
    @Story(Stories.DEFAULT_LOGIN)
    @Severity(SeverityLevel.BLOCKER)
    public void testBravo() {
        step("other step");
    }
}
