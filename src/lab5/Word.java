package lab5;

import java.util.Arrays;

public class Word extends SentenceElement {
    private Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    public Word(String wordString) {
        char[] lettersChars = wordString.toCharArray();
        letters = new Letter[lettersChars.length];
        for (int i = 0; i < lettersChars.length; i++) {
            letters[i] = new Letter(lettersChars[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder wordString = new StringBuilder();
        for (Letter letter : letters) {
            wordString.append(letter.toString());
        }
        return wordString.toString();
    }

    public boolean equalsString(String wordString) {
        return toString().equals(wordString);
    }
}
