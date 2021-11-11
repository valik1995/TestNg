import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest {

    @Test
    public void simpleTest(){
        Assert.assertEquals(
                Main.pad("Valiko", 10, "!"),
                "Valiko!!!!",
                "Error message"
        );
    }

    @Test
    public void testNull(){
        Assert.assertNull(Main.pad(null, 10, ""));
    }


    @Test(alwaysRun = true, description = "Этот тест делает что-то", priority = 1)
    public void emptyStrTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(
                Main.pad("", 0, ""),
                "f"
        );
        softAssert.assertEquals(
                Main.pad("", 0, ""),
                ""
        );
        softAssert.assertAll();
    }

    @Test(expectedExceptions =  RuntimeException.class)
    public void errorTest(){
                Main.pad("Valiko", 2, "");
    }

    @Test
    public void phoneValidation(){
        Assert.assertEquals(Person.createPhoneNumber(new int[]{3, 3, 6,5,0,6,6,1,9}), "(33) 650-66-19");
    }
}
