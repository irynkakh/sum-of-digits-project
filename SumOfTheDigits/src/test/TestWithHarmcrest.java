package test;

import main.GetsNumbers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestWithHarmcrest {

    @Test
    public void testSumOfDigitsGreaterThenPositiveCase() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertThat("Sum of digits is not greater then 0", result, greaterThan(0));
    }

    @Test
    public void testSumOfDigitsGreaterThenNegativeCase() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertThat("Sum of digits is not greater then 27", result, greaterThan(27));
    }

    @Test
    public void testSumOfDigitsNotEqualPositiveCase() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertThat("Sum of digits not equal 18", result, not(equalTo(18)));
    }

    @Test
    public void testSumOfDigitsNotEqualNegativeCase() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertThat("Sum of digits is equal 17", result, not(equalTo(17)));
    }


    @Test
    public void testListEqual() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat("list of digits are not the same", actual, is(expected));

    }

    @Test
    public void testListNotEqual() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 4, 5);
        assertThat("list of the digits are not the same", actual, is(expected));

    }

    @Test
    public void testLisInAnyOrder() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat("list of digits doenst contain expected values in any order", actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void testListInAnyOrderFailed() {
        List<Integer> actual = Arrays.asList(2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat("list of digits doesn't contain expected values in any order", actual, containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void testListContains() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat("list of digits doesnt contain expected value in proper order", actual, contains(expected.toArray()));
    }

    @Test
    public void testListContainsFailed() {
        List<Integer> actual = Arrays.asList(2, 3, 4, 5, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertThat("list of digits doesnt contain expected value in proper order", actual, contains(expected.toArray()));
    }

    @Test
    public void testListContainsOneElement() {
        List<Integer> actual = Arrays.asList(2, 3, 4, 5, 1);
        Integer expected = 5;
        assertThat("list of digits doesnt contain this value", actual, hasItem(expected));
    }

    @Test
    public void testListContainsOneElementFailed() {
        List<Integer> actual = Arrays.asList(2, 3, 4, 5, 1);
        Integer expected = 55;
        assertThat("list of digits doesnt contain this value", actual, hasItem(expected));
    }


}
