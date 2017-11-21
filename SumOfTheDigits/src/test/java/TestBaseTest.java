import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class TestBaseTest {

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("This will be executed before all methods");

    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("This will be executed after all methods");
    }


    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This will be executed before each method");
    }


    @AfterEach
    public void afterEachMethod() {
        System.out.println("This will be executed after each method");
    }

}
