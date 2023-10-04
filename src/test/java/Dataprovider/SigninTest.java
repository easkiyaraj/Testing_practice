package Dataprovider;

import org.testng.annotations.DataProvider;

public class SigninTest{
    @DataProvider(name = "signin-data")
    Object[][] loginData(){
        Object[][] data = {
                {"admin", "admin123"},
                {"easki", "easki123"},
                {"raja", "raja123"}
        };
        return data;
    }
}
