
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros;
        int newCents;

        newEuros = this.euros + added.euros;
        newCents = this.cents + added.cents;

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean less(Money compared) {
        return this.euros * 100 + this.cents < compared.euros * 100 + compared.cents;
    }

    public Money minus(Money decremented) {
        int newCents;

        newCents = this.euros * 100 + this.cents - decremented.euros * 100 - decremented.cents;

        if (newCents < 0) {
            Money newMoney = new Money(0, 0);
            return newMoney;
        } else {
            Money newMoney = new Money(0, newCents);
            return newMoney;
        }
    }
}
