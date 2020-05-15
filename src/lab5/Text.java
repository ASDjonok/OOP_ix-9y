package lab5;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : ""));
        }
        return textString.toString();
    }

    public int findWordEntrancesQuantity(String wordString) {
        int wordEntrancesQuantity = 0;

        for (Sentence sentence : sentences) {
            wordEntrancesQuantity += sentence.findWordEntrancesQuantity(wordString);
        }

        return wordEntrancesQuantity;
    }
}
