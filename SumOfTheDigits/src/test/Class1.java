package test;

import main.GetsNumbers;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Class1 extends TestBase {

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method");
    }

    @AfterEach
    public void afterEachMethod() {
        System.out.println("This will be executed after each method");
    }

    @Test
    public void testSumOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertEquals(17, result);
        //assertThat(result,  equalTo(17));
    }

    @Test
    public void testSumOfDigitsError() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(9172);
        assertEquals(17, result);
        //assertThat(result,  equalTo(17));
    }

    @Test
    public void testSumOfDigitsFailed() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertEquals(18, result);
        //assertThat(result,  equalTo(18));
    }

    @Test
    public void testCountOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        Assertions.assertThrows(IllegalArgumentException.class, () -> getsNumbers.sumOdDigits(2222));

        // int result = getsNumbers.sumOdDigits(2222);
    }

    @Disabled
    @Test
    public void testNotBeExecuted() {
        System.out.println("This will be ignored");
    }
}
