package test;

import main.GetsNumbers;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;


public class CheckingTimeOutTest {

    @Test
    public void sumOfDigitsNotExceed15Sec() {
        GetsNumbers getsNumbers = new GetsNumbers();
        assertTimeout(Duration.ofSeconds(15), () -> {
            getsNumbers.sumOdDigits(917);
        });
    }

    @Test
    public void sumOfDigitsExceed1Sec() {
        GetsNumbers getsNumbers = new GetsNumbers();
        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(2000);
            getsNumbers.sumOdDigits(999);
        }, "The sumofDigits method take more than 1 second");
    }







}


