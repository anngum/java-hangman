package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawWord {

    private String selectedWord;

    public DrawWord() {
        selectedWord = new String();
        this.selectedWord = drawWord();
    }

    public String getSelectedWord() {
        return selectedWord;
    }

    public void setSelectedWord(String selectedWord) {
        this.selectedWord = selectedWord;
    }

    private static String drawWord() {
        Random random = new Random();

        ReadFile readWords = new ReadFile();
        List<String> wordsList = new ArrayList<String>();
        wordsList = readWords.getWordsList();

        int randomNumber = random.nextInt(wordsList.size());
        String randomWord = wordsList.get(randomNumber);

        return randomWord;
    }
}