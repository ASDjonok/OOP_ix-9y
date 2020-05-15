package lab5;

public class Sentence {
    private SentenceElement[] sentenceElements;

    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    /*public Sentence(Word[] words, Punctuation[] punctuations) {
        this.sentenceElements = sentenceElements;
    }*/

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

    public int findWordEntrancesQuantity(String wordString) {
        int wordEntrancesQuantity = 0;

        for (SentenceElement sentenceElement : sentenceElements) {
            if (sentenceElement instanceof Word) {
//                if (sentenceElement.toString().equals(wordString)) {
                Word word = (Word) sentenceElement;
                if (word.equalsString(wordString)) {
                    wordEntrancesQuantity++;
                }
            }
        }

        return wordEntrancesQuantity;
    }
}
