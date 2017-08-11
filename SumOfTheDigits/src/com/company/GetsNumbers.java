package com.company;

public class GetsNumbers {

    public int count;

    private int calculateDigits(int number) {
        char[] arrayOfDigits = String.valueOf(number).toCharArray();
        count = arrayOfDigits.length;

        return count;
    }

    public int sumOdDigits(int number) {
        count = calculateDigits(number);
        int[] digits = new int[count];
        int sum = 0;
        if (count < 1 || count > 3) throw new IllegalArgumentException("Characters of number are more than 3");
        for (int i = 0; i < count; i++) {

            digits[i] = number / (int) (Math.pow(10, count - 1 - i));

            number = number - digits[i] * (int) (Math.pow(10, count - 1 - i));
            sum += digits[i];
        }

        return sum;
    }
}
