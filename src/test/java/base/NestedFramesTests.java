package base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramesTests extends BaseTests{
    private WebDriver driver;

    @Test
    public void testNestedFrames() {
        var nestedFramesPage = homePage.clickNestedFramesLink();

        nestedFramesPage.switchToLeftFrame();
        Assert.assertEquals(nestedFramesPage.getFrameText(), "BOTTOM", "Wrong frame text");
        nestedFramesPage.switchToMainFrame();
    }
}
