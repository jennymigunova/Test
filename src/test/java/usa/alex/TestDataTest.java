package usa.alex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDataTest {


    @Test
    void calculate() {
        TestData testData = new TestData();
        int[] nums = {2, -5, 9, -15, 0, 4};
        int actual = testData.calculate(nums);
        int expected = 15;
        assertEquals(expected, actual);
    }
}