package functionaltest;

import helperlib.ReadPropFiles;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pagedriver.PageDriver;

import java.io.IOException;
import java.util.List;

public class HeaderPageTests extends PageDriver {
    public static final String[] EXPECTED_MENU_ICONS = {"Home", "Calendar", "Contacts", "Companies", "Deals",
            "Tasks", "Cases", "Calls", "Documents", "Email", "Campaigns", "Forms"};
    public static final String[] ExPECTED_HEADER_TEXT={"Deals Summary","Tasks activity stream","Deals","Twitter","Exchange Rates"};
    @BeforeClass
    public void performLoginTests() throws IOException {
        loginPage().emailField().sendKeys(ReadPropFiles.getPropertyValue("email_address"));
        loginPage().passwordField().sendKeys(ReadPropFiles.getPropertyValue("password"));
        loginPage().submitButton().click();
        Assert.assertTrue(headerPage().headerElement().isDisplayed());
    }
    @Test
    public void validateMenuIcons() throws IOException {
        List<WebElement> menuElements = headerPage().menuIcon();
        for (int i = 0; i < menuElements.size(); i++) {
            Assert.assertEquals(menuElements.get(i).getText(), EXPECTED_MENU_ICONS[i]);
        }
    }
    @Test
    public void validateheaderText() throws IOException {
        List<WebElement> headerElement= headerPage().headertext();
        for (int i = 0; i < headerElement.size(); i++) {
            Assert.assertEquals(headerElement.get(i).getText(), ExPECTED_HEADER_TEXT[i]);
        }

    }


}
