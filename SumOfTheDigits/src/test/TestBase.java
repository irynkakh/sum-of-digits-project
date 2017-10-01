package test;

import org.junit.jupiter.api.*;

public abstract class TestBase {

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("This will be executed before all methods");

    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("This will be executed after all methods");
    }


    abstract void beforeEachMethod();


    abstract void afterEachMethod();


}
