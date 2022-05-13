import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {
    @Test
    public void firstTest () {
        Task6 task6 = new Task6();
        boolean result = task6.isEqual(5,5);
        Assert.assertTrue(result);
    }
}
