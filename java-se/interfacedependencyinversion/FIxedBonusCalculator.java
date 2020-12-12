package interfacedependencyinversion;

public class FIxedBonusCalculator implements BonusCalculator {

    public int calculateBonus(int salary) {
        return salary + 10000;
    }
}
