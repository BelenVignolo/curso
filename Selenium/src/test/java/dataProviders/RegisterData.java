package dataProviders;

import org.testng.annotations.DataProvider;

public class RegisterData {
    @DataProvider(name = "register")
    public static Object[][] getProductsData(){
        return new Object[][]{
                {"Santiago","Perez","santiagoperez@mail.com","123456","123456"},
                {"Berenice","Perez","bere.perez@mail.com","123456","123456"},
        };
    }
}
