package test.java;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Class3Test extends TestBaseTest {

    @Test
    public void firstTest() {
        System.out.println("first test");
    }


    @Test
    public void secondTest() {
        System.out.println("second test");
    }

    @Test
    public void thirdTest() {
        System.out.println("third test");
    }
}
