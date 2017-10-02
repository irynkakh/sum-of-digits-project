package test;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)


@RunWith(JUnitPlatform.class)
@SelectPackages("test")
@IncludeTags("development")
public class Class3 extends TestBase {


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
