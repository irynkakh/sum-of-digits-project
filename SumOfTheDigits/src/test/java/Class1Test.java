package test.java;

import main.GetsNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Class1Test extends TestBaseTest {


    @Test
    public void testSumOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertEquals(17, result);

    }

    @Test
    public void testSumOfDigitsError() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(9172);
        assertEquals(17, result);

    }

    @Test
    public void testSumOfDigitsFailed() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertEquals(18, result);

    }

    @Test
    public void testCountOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        Assertions.assertThrows(IllegalArgumentException.class, () -> getsNumbers.sumOdDigits(2222));


    }

    @Disabled
    @Test
    public void testNotBeExecuted() {
        System.out.println("This will be ignored");
    }
}
