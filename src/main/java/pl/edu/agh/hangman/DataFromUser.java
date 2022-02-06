package pl.edu.agh.hangman;

import java.util.Scanner;

public class DataFromUser {

    private String letter;

    public DataFromUser() {
        letter = new String();
        this.letter = getLetterByScanner();
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    private static String getLetterByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter");
        String letter = scanner.nextLine();
        scanner.close();
        return letter;
    }
}