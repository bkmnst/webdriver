package base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void testSlider() {
        var sliderPage = homePage.clickSliderLink();
        sliderPage.clickSlider();
        for (int i = 0; i < 3; i++) {
            sliderPage.pressArrowRight();
        }
        Assert.assertEquals(sliderPage.getStatus(), "4", "Incorrect range");
    }
}
