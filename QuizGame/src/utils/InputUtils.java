package utils;

import java.util.Scanner;

public class InputUtils {
    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Invalid input. Please enter an integer.");
        }
        return scanner.nextInt();
    }
}
