package lab5;

public class Letter {
    // todo analyze are all of the fields needed
    private boolean isUpperCase;
    private boolean isVowel;
    private char symbol; // A, a

    public Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "" + symbol;
//        return Character.toString(symbol);
    }
}
