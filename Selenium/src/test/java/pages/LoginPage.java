package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static WebDriver driver;

    public LoginPage(WebDriver driver){
        LoginPage.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//header[@id='header']/div/div[2]/a[3]/span[2]")
    private WebElement accountMenu;

    @FindBy(linkText = "Log In")
    private WebElement loginbtn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id="pass")
    private  WebElement password;

    @FindBy(id = "send2")
    private  WebElement sendbtn;

    @FindBy(css = ".page-title h1")
    private WebElement loginAssertion;


    @Step("Haciendo el login")
    public String getLoginAssertion(){
        return loginAssertion.getText();
    }
    public void login(String mail, String pass){
        accountMenu.click();
        loginbtn.click();
        email.click();
        email.sendKeys(mail);
        password.click();
        password.sendKeys(pass);
        sendbtn.click();

    }
}
