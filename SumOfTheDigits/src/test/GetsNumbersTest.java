package test;

import main.GetsNumbers;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class GetsNumbersTest {

    @Test
    @Tag("development")
    @Tag("production")
    public void testSumOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertEquals( 17, result);
    }
    @Test
    @Tag("development")
    public void sumOfDigitsNotExceed15Sec(){
        GetsNumbers getsNumbers = new GetsNumbers();
        assertTimeout(Duration.ofSeconds(15), () -> {
            getsNumbers.sumOdDigits(917);
        });
    }

    @Test
    @Tag("development")
    @Tag("production")
    public void sumOfDigitsExceed1Sec(){

        GetsNumbers getsNumbers = new GetsNumbers();
        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(2000);
            getsNumbers.sumOdDigits(999);
        }, "The sumofDigits method take more than 1 second");
    }
    @Test
    @Tag("development")
    public void testCountOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        Assertions.assertThrows(IllegalArgumentException.class, () -> getsNumbers.sumOdDigits(2222));

        // int result = getsNumbers.sumOdDigits(2222);
    }

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("This will be executed before all methods");

    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("This will be executed after all methods");
    }

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method");
    }

    @AfterEach
    public void afterEachMethod(){
        System.out.println("This will be executed after each method");
    }

    @Disabled
    @Test
    public void testNotBeExecuted(){
        System.out.println("This will be ignored");
    }

    /*@ParameterizedTest
    @ValueSource(ints = {150, 30, 150})
    public void testmethod(int p) throws Exception {
        GetsNumbers getsNumbers = new GetsNumbers();

        assertEquals("15", getsNumbers.sumOdDigits(p));
         }*/

    /*@RunWith(JUnitPlatform.class)
    @IncludeEngines("junit-jupiter")
    @SelectPackages("...")
    public void testmethod2(int p) throws Exception {
        GetsNumbers getsNumbers = new GetsNumbers();

        assertEquals("15", getsNumbers.sumOdDigits(p));
    }
*/

}


