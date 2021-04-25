import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{

    @Test
    public void testGetLocalNumber()
    {
        int actual = getLocalNumber();
        int expected = 14;
        Assert.assertTrue("Метод getLocalNumber возращает неожидаемый результат", actual == expected);
    }

    @Test
    public void testGetClassNumber()
    {
        int actual = getClassNumber();
        Assert.assertTrue("Метод getClassNumber возращает число меньше 45", actual > 45);
    }

    @Test
    public void testGetClassString()
    {
        String actual = getClassString();
        Assert.assertTrue("Строка не содержит hello или Hello", actual.contains("hello") || actual.contains("Hello"));

    }
}
