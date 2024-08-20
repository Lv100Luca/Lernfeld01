public class Amount {
    private static final int dozen = 12;
    private static final int schock = 60;
    private static final int gros = 144;

    public Amount(int amount) {
        if (amount < 0)
            throw new IllegalArgumentException("Amount must be positive");

        this.amount = amount;
    }

    int amount;

    public void printAmount() {
        if (amount < dozen) {
            System.out.printf("%d pieces", amount);
            return;
        }

        var grosRemaining = amount % gros;

        var nrOfGross = (amount - grosRemaining) / gros;

        var schockRemaining = grosRemaining % schock;

        var nrOfSchocks = (grosRemaining - schockRemaining) / schock;

        var dozenRemaining = schockRemaining % dozen;

        var nrOfDozens = (schockRemaining - dozenRemaining) / dozen;

        System.out.printf("%d gross, %d schocks, %d dozen, %d pieces", nrOfGross, nrOfSchocks, nrOfDozens, dozenRemaining);
    }

    public void printAmount2() {
        var grosCount = amount / gros;
        var grosRemaining = amount % gros;

        var schockCount = grosRemaining / schock;
        var schockRemaining = grosRemaining % schock;

        var dozenCount = schockRemaining / dozen;
        var dozenRemaining = schockRemaining % dozen;

        System.out.printf("%d gros, %d schocks, %d dozen, %d pieces", grosCount, schockCount, dozenCount, dozenRemaining);
    }
}
