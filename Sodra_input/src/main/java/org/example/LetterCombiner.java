package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombiner {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Įveskite dviejų raidžių kodą (arba „exit“, kad išeitumėte): ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                break;
            }

            if (input.length() != 2) {
                System.out.println("Ivestas netaisinglingas kiekis raidžių. Įveskite dviejų raidžių kodą (arba „exit“, kad išeitumėte):\n" +
                        "\n");
                continue;
            }

            letters.add(input);
        }

        String currentLetter = letters.get(0).substring(0, 1);  // Pradedant pirmąja pirmojo kodo raide
        String constructedWord = currentLetter;

        while (true) {
            String nextLetter = null;
            for (String letter : letters) {
                if (letter.startsWith(currentLetter) && !letter.equals(constructedWord)) {
                    nextLetter = letter.substring(1);
                    constructedWord += nextLetter;
                    currentLetter = nextLetter;
                    break;
                }
            }

            if (nextLetter == null) {
                System.out.println("No valid next letter found.");
                break;
            }
        }

        System.out.println("Constructed word: " + constructedWord);
    }
}
