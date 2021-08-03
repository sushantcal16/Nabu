package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.List;

public class HeaderPage extends BaseTest {
    public WebElement headerElement() throws IOException {
        By headerElement = By.xpath("//div[@class='header item']");
        applyFluent().until(ExpectedConditions.visibilityOfElementLocated(headerElement));
        return driver.findElement(headerElement);
    }
    public List<WebElement> menuIcon() throws IOException {
        By menuElements= By.xpath("//div[@class='menu-item-wrapper']/a[@class='item']");
        applyFluent().until(ExpectedConditions.visibilityOfElementLocated(menuElements));
        return driver.findElements(menuElements);
    }
    public List<WebElement> headertext() throws IOException {
        By headerText= By.xpath("//div[@class='header']");
        applyFluent().until(ExpectedConditions.visibilityOfElementLocated(headerText));
        return driver.findElements(headerText);
    }
}
