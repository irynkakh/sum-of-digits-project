package test;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.DEFAULT)

@RunWith(JUnitPlatform.class)
@SelectPackages("test")
@IncludeTags("development")
public class Class3 extends TestBase {

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method");
    }

    @AfterEach
    public void afterEachMethod() {
        System.out.println("This will be executed after each method");
    }

    @Tag("production")
    @Test
    public void firstTest() {
        System.out.println("first test");
    }

    @Tag("development")
    @Test
    public void secondTest() {
        System.out.println("second test");
    }

    @Tag("development")
    @Test
    public void thirdTest() {
        System.out.println("third test");
    }
}
