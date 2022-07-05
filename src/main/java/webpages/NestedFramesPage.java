package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToLeftFrame() {
        driver.switchTo().frame(1);
    }

    public void switchToBottomFrame() {
        driver.switchTo().frame(2);
    }
    public void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }

    public String getFrameText() {
        return driver.findElement(By.xpath("/html/body")).getText();
    }


}
