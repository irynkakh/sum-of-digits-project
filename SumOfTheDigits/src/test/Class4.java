package test;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Class4 extends TestBase{

    @Test
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method");
    }


    @Test
    public void afterEachMethod() {
        System.out.println("This will be executed after each method");
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
