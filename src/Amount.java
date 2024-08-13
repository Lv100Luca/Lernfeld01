public class Amount {
    private static final int dozen = 12;
    private static final int schock = 60;
    private static final int gros = 144;

    public Amount(int amount) {
        this.amount = amount;
    }

    int amount;

    public void printAmount() {
        var remaining = amount;
        var remainingAfterGross = remaining % gros;
    }
}
