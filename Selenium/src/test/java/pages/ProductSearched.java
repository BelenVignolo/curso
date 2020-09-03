package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearched {

    private static WebDriver driver;
    public ProductSearched(WebDriver driver){
        ProductSearched.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "search")
    private WebElement search;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSubmit;
    @FindBy(css = ".products-grid .product-image img")
    private WebElement product;
    @FindBy(css = ".product-view .add-to-cart-buttons .button")
    private WebElement btnCart;
    @FindBy(css = ".cart .page-title h1")
    private WebElement cartAssertion;


    @Step("agregando un produco al carrito")
    public void addProductToCart(String prod){
        search.click();
        search.sendKeys(prod);
        btnSubmit.click();
        product.click();
        btnCart.click();
    }

    @Step("Obteniendo nombre de la pagina en la que estamos")
    public String cartAssertion(){
        return cartAssertion.getText();

    }
}
