package suite.tests;

import org.junit.jupiter.api.Test;

public class SecondScopeTest {

    @Test
    public void SecondClassFirstMethod() {
        System.out.println("Second class, first method");
    }

    @Test
    public void SecondClassSecondMethod() {
        System.out.println("Second class, second method");
    }
}
