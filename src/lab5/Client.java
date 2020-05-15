package lab5;

public class Client {
    private Text text;

    public Client(Text text) {
        this.text = text;
    }

    public void startLiveInTheSystem() {
        System.out.println("Word entrances quantity: " + text.findWordEntrancesQuantity("Hello"));
    }

}
