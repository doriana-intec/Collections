package be.intecbrussel.maps.wallet;

public enum Coins {
    ONE_CENT(0.01),
    TWO_CENT(0.02),
    FIVE_CENT(0.05),
    TEN_CENT(0.10),
    TWENTY_CENT(0.20),
    FIFTY_CENT(0.50),
    ONE_EURO(1.0),
    TWO_EURO(2.0);

    double value;

    Coins(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
