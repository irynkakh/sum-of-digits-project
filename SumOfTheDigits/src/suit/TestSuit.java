package suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.TestWithHarmcrest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
      //  Class1.class,
        //Class2.class,
       // Class3.class,
        //Class4.class,
        TestWithHarmcrest.class
})
public class TestSuit {

}

