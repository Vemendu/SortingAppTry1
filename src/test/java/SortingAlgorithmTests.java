import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import DifferentTests.*;

import static org.junit.Assert.assertEquals;

public class SortingAlgorithmTests {

    @Test
    public void testNullCaseTesting()
    {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(NullCaseTesting.class);

        assertEquals(0, result.getFailureCount());
    }

    @Test
    public void testZeroCaseTesting()
    {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(ZeroCaseTesting.class);

        assertEquals(0, result.getFailureCount());
    }

    @Test
    public void testOneCaseTesting()
    {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(OneCaseTesting.class);

        assertEquals(0, result.getFailureCount());
    }

    @Test
    public void testTenCaseTesting()
    {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(TenCaseTesting.class);

        assertEquals(0, result.getFailureCount());
    }

    @Test
    public void testMoreThanTenCaseTesting()
    {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(MoreThanTenCaseTesting.class);

        assertEquals(0, result.getFailureCount());
    }
}
