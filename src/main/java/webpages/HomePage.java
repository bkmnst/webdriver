package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By sliderLink = By.linkText("Horizontal Slider");
    private By contextMenuLink = By.linkText("Context Menu");
    private By nestedFramesLink = By.linkText("Nested Frames");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public PasswordPage clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
        return new PasswordPage(driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        driver.findElement(contextMenuLink).click();
        return new ContextMenuPage(driver);
    }

    public SliderPage clickSliderLink() {
        driver.findElement(sliderLink).click();
        return new SliderPage(driver);
    }

    public NestedFramesPage clickNestedFramesLink() {
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }
}
