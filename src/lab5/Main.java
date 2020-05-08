package lab5;

public class Main {
    public static void main(String[] args) {

        Letter letter = new Letter('a');

        System.out.println(letter);

        Letter letter2 = new Letter('A');

        System.out.println(letter2);

        Letter[] letters = {
                new Letter('H'),
                new Letter('e'),
                new Letter('l'),
                new Letter('l'),
                new Letter('o'),
        };

        Word word = new Word(letters);

        System.out.println(word);

        Letter[] letters2 = {
                new Letter('w'),
                new Letter('o'),
                new Letter('r'),
                new Letter('l'),
                new Letter('d'),
        };

        Word word2 = new Word(letters2);

        Punctuation punctuation = new Punctuation(",");
        Punctuation punctuation2 = new Punctuation("!");

        Sentence sentence = new Sentence(new Object[]{
                word,
                punctuation,
                word2,
                punctuation2,
        });

        System.out.println(sentence);

        System.out.println("Done! :)");
    }
}
