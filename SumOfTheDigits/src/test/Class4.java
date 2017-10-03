package test;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Class4 extends TestBase {


    @Override
    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method in class4");
    }


    @AfterEach
    public void afterEachMethodNew() {
        System.out.println("This will be executed after each method in class4");
    }

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
