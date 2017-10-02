package suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.Class1;
import test.TestWithHarmcrest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Class1.class,
        TestWithHarmcrest.class
})
public class TestSuit {

}

