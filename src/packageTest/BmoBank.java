package packageTest;

import java.util.Objects;

public class BmoBank extends Bank {

    private String location;
    private double gicBalance;

    @Override
    public double totalBalance() {

        return getChecking() + getSaving() + gicBalance;
    }

    public BmoBank(String name, double checking, double saving, String location, double gicBalance) {
        super(name, checking, saving);
        this.location = location;
        this.gicBalance = gicBalance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getGicBalance() {
        return gicBalance;
    }

    public void setGicBalance(double gicBalance) {
        this.gicBalance = gicBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BmoBank bmoBank = (BmoBank) o;
        return Double.compare(gicBalance, bmoBank.gicBalance) == 0 && Objects.equals(location, bmoBank.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location, gicBalance);
    }
}
