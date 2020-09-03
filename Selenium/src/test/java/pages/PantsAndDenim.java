package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PantsAndDenim {

    private static WebDriver driver;
    public PantsAndDenim(WebDriver driver){
        PantsAndDenim.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".nav-primary li.level0 > a")
    private WebElement btnWomen;
    @FindBy(xpath = "//img[@alt='Pants & Denim']")
    private WebElement btnPantsAndDenim;
    @FindBy(linkText = "Add to Wishlist")
    private WebElement btnAddToWishList;
    @FindBy(css = "body.customer-account .my-account .title-buttons h1")
    private WebElement assertion;

    @Step("Obteniendo nombre de la pagina en la que estamos")
    public String assertion(){
        return assertion.getText();
    }

    @Step("Agregando un producto a la wish list")
    public void toWishList(){
        btnWomen.click();
        btnPantsAndDenim.click();
        btnAddToWishList.click();
    }
}
