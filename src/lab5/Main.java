package lab5;

public class Main {

    private static void myMethod() {
        System.out.println("In myMethod()");
    }

    private static void myMethod(int a) {
        System.out.println("In myMethod(int a = " + a + ")");
    }

    public static void main(String[] args) {
        Text text2 = new Text("Hello, world. Hello, Oleksii!");
        System.out.println(text2);
        Client client = new Client(text2);
        client.startLiveInTheSystem();

        /*myMethod(1);
        myMethod();

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

        Sentence sentence = new Sentence(new SentenceElement[]{
                word,
                punctuation,
                word2,
                punctuation2,
        });

        Word word3 = new Word(new Letter[]{
                new Letter('O'),
                new Letter('l'),
                new Letter('e'),
                new Letter('k'),
                new Letter('s'),
                new Letter('i'),
                new Letter('i'),
        });

        Sentence sentence2 = new Sentence(new SentenceElement[]{
                word,
                punctuation,
                word3,
                punctuation2,
        });

        System.out.println(sentence);
        System.out.println(sentence2);

        Text text = new Text(new Sentence[]{sentence, sentence2});*/
//        Text text2 = new Text("Hello, world. Hello, Oleksii.");

//        System.out.println(text);

        System.out.println("Done! :)");
    }
}
