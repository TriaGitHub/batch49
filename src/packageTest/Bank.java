package packageTest;

import java.util.Objects;

public class Bank {

    private String name;
    private double checking;
    private double saving;


    public double totalBalance() {

        return checking + saving;
    }

    public Bank(String name, double checking, double saving) {
        this.name = name;
        this.checking = checking;
        this.saving = saving;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChecking() {
        return checking;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(checking, bank.checking) == 0 && Double.compare(saving, bank.saving) == 0 && Objects.equals(name, bank.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, checking, saving);
    }
}
