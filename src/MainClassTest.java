import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{

    MainClass main = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int actual = main.getLocalNumber(14);
        int expected = 14;
        Assert.assertTrue("Метод getLocalNumber возращает неожидаемый результат", actual == expected);
    }

    @Test
    public void testGetClassNumber()
    {
        int actual = main.getClassNumber();
        Assert.assertTrue("Метод getClassNumber возращает число меньше 45", actual > 45);
    }
}
