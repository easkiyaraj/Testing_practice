package Attributes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
   @Test
   @Parameters({"Easki"})
    public void sendMessageTest(String Easki)
    {
        System.out.println(Easki);
    }
    @Test
    @Parameters({"ganesh"})
    public void sendPostTest(@Optional("default value") String Ganesh)
    {
        System.out.println(Ganesh);
    }
    @Test
    @Parameters({"karuna"})
    public void registerAccountTest(String karuna)
    {
        System.out.println(karuna);
    }
    @Test
    public void loginTest()
    {
        System.out.println("Test4");
    }
}
