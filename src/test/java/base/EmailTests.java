package base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import webpages.ErrorPage;
import webpages.PasswordPage;

import static org.testng.Assert.assertEquals;

public class EmailTests extends BaseTests {

    @Test
    public void testEmail() {
        PasswordPage passwordPage = homePage.clickForgotPasswordLink();
        passwordPage.inputEmail("happy@lol.kek");
        ErrorPage errorPage = passwordPage.clickSubmit();
        assertEquals(errorPage.getMessage(), "Internal Server Error", "Message not found.");
    }
}
