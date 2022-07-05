package base;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextTests extends BaseTests{

    @Test
    public void testRMBClick() {
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.rightClickBox();
        Assert.assertEquals(contextMenuPage.getAlertText(), "You selected a context menu", "Wrong alert text");
        contextMenuPage.closeAlert();
    }
}
