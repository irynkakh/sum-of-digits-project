package test;

import main.GetsNumbers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Class2 extends TestBase {
    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method");
    }

    @AfterEach
    public void afterEachMethod() {
        System.out.println("This will be executed after each method");
    }

    @ParameterizedTest
    @ValueSource(ints = {199, 991, 784})
    public void testmethod(int p) throws Exception {
        GetsNumbers getsNumbers = new GetsNumbers();
        assertEquals(19, getsNumbers.sumOdDigits(p));

    }

}
