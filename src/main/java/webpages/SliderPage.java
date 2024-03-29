package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPage {
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By range = By.id("range");
    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider() {
        driver.findElement(slider).click();
    }

    public void pressArrowRight() {
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getStatus() {
        return driver.findElement(range).getText();
    }



}

