package com.adventure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    YourClass yc;

    public Main() {
        yc = new YourClass();
    }


    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.checker();
    }


    public void checker() throws IOException {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        System.out.println("What is " + a + "+" + b + " ?");
        System.out.print("Enter your guess: ");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();
            int guess = Integer.valueOf(input);
            System.out.println("your guess is: " + guess);

            yc.check(a, b, guess);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }


}