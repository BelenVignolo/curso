package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    private static WebDriver driver;
    String url = "http://magento-demo.lexiconn.com/customer/account/create/";

    public HomePage(WebDriver driver){
        HomePage.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Register")
    private WebElement register;

    @FindBy(xpath = "//header[@id='header']/div/div[2]/a[3]/span[2]")
    private WebElement accountbtn;

    @FindBy(css =" .page-title h1")
    private WebElement createAccountTitle;

    @FindBy(xpath = "//img[@alt='Travel Gear for Every Occasion']")
    private  WebElement category;

    @Step("Obteniendo el nombre de la pagina en la que estamos")
    public String getTitle(){
        return createAccountTitle.getText();
    }

    @Step("Registrando un usuario")
    public RegisterAcc clickRegister(){
        accountbtn.click();
        register.click();
        driver.get(url);
        return new RegisterAcc(driver);
    }


}

