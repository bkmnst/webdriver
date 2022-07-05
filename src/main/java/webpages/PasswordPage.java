package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordPage {
    private WebDriver driver;
    private By emailInput = By.id("email");
    private By submitButton = By.cssSelector("#form_submit");

    public PasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public ErrorPage clickSubmit() {
        driver.findElement(submitButton).click();
        return new ErrorPage(driver);
    }

}
