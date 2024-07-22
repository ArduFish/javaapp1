package org.example;

import java.util.Objects;
import java.util.Scanner;  // Import the Scanner class

import org.example.Fish;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.printFish();
        Scanner newScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello world!");
        System.out.println("Type something. Try typing fish or stop.");
        while (true) {
            String text = newScanner.nextLine();  // Read user input
            if (Objects.equals(text, "fish")) {
                fish.fishy();
            } else if (Objects.equals(text, "stop")) {
                fish.stop();
                System.exit(0);
            } else {
                System.out.println(text);
            }
        }
    }
}