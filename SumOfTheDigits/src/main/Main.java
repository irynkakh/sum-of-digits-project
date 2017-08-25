package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        do {
            System.out.println("enter a number");
            int number = Integer.parseInt(in.readLine());
            GetsNumbers getsNumbers = new GetsNumbers();

            System.out.println("Sum of " + number + " = " + getsNumbers.sumOdDigits(number));
        }
        while (!in.readLine().equals("end!"));
    }
}