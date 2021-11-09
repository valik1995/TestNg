import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void simpleTest(){
        Assert.assertEquals(
                Main.pad("Valiko", 10, "!"),
                "Valiko!!!!"
        );
    }

    @Test
    public void testNull(){
        Assert.assertNull(Main.pad(null, 10, ""));
    }

    @Test
    public void emptyStrTest(){
        Assert.assertEquals(
                Main.pad("", 0, ""),
                ""
        );
    }

    @Test(expectedExceptions =  RuntimeException.class)
    public void errorTest(){
                Main.pad("Valiko", 2, "");
    }
}
