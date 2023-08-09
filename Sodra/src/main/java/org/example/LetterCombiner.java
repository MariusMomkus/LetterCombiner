package org.example;

import java.util.ArrayList;
import java.util.List;

public class LetterCombiner {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("SO");
        letters.add("RA");
        letters.add("OD");
        letters.add("DR");

        String currentLetter = "S";  // zodis prasideda raide S
        String finalWord = "";  // galutinis zodis

        while (!currentLetter.equals("A")) {  // pabaigti kai pasiekia raide A
            finalWord += currentLetter;

            String nextLetter = null;
            for (String letter : letters) {
                if (letter.startsWith(currentLetter)) {
                    nextLetter = letter.substring(1);
                    letters.remove(letter);
                    break;
                }
            }

            if (nextLetter == null) {
                System.out.println("Tinkama raide nerasta.");
                break;
            }

            currentLetter = nextLetter;
        }

        finalWord += currentLetter;  // pridėti paskutinę raidę
        System.out.println("Final word: " + finalWord);
    }
}
