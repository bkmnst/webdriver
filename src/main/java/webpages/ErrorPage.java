package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorPage {
    private WebDriver driver;
    By message = By.tagName("h1");

    public ErrorPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }
}
