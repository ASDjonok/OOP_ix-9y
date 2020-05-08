package lab5;

import java.util.Arrays;
import java.util.Objects;

public class Sentence {
//    todo fix type Object
    private Object[] sentenceElements;

    public Sentence(Object[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                    sentenceElements[i].toString()
            );
        }
        return sentenceString.toString();
    }
}
