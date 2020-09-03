package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagsAndLuggage {
    private static WebDriver driver;
    String url = "http://magento-demo.lexiconn.com/catalog/product_compare/index/";
    public BagsAndLuggage(WebDriver driver){
        BagsAndLuggage.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//img[@alt='Travel Gear for Every Occasion']")
    private WebElement category;
    @FindBy(linkText = "Add to Compare")
    private WebElement product1;
    @FindBy(xpath = "(//a[contains(text(),'Add to Compare')])[2]")
    private  WebElement product2;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement btnCompare;
    @FindBy(css = ".page-popup h1")
    private WebElement compare;

    @Step("Obteniendo el nombre de la pagina en la que estamos")
    public String getAssertion(){
        return compare.getText();
    }

    @Step("Comparando dos productos")
    public void compareProd(){
        category.click();
        product1.click();
        product2.click();
        btnCompare.click();
        driver.get(url);
    }



}
