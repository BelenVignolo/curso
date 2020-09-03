package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAcc {
    private static WebDriver driver;

    public RegisterAcc(WebDriver driver){
        RegisterAcc.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "email_address")
    private WebElement email_address;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "confirmation")
    private WebElement confirmation;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement btnSubmit;

    @FindBy(css = "body.customer-account .my-account .page-title h1")
    private WebElement  assertion;

    @FindBy(xpath = "//header[@id='header']/div/div[2]/a[3]/span[2]")
    private WebElement btnAccount;

    @FindBy(css = "#header-account > div > ul > li.last > a")
    private WebElement btnLogout;

    @Step("Obteniendo la pagina en la que estamos")
    public String getAssertion(){
        return assertion.getText();
    }

    @Step("creando una cuenta")
    public void createAccount(String name, String surname, String email, String pass, String confir){

        firstname.sendKeys(name);
        lastname.sendKeys(surname);
        email_address.sendKeys(email);
        password.sendKeys(pass);
        confirmation.sendKeys(confir);
        btnSubmit.click();

    }

    @Step("Cerrar sesion")
    public void Logout(){
        btnAccount.click();
        btnLogout.click();
    }
}
