package interfacedependencyinversion;

public class PercentBonusCalculator implements BonusCalculator {

    public int calculateBonus(int salary) {
        return (int)(salary * 1.25);
    }
}
