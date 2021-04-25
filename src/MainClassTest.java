import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{

    @Test
    public void firstTest()
    {
        MainClass main = new MainClass();
        int actual = main.getLocalNumber(14);
        int expected = 14;
        Assert.assertTrue("Метод getLocalNumber возращает неожидаемый резульат", actual == expected);
    }
}
