package SaleBonusService;

public class BonusService {
    public double calculate (double[] sales) {

        double bonusAmount = 0;
        double percent = 0.05;

        for (double sale : sales) {
            if (sale > 10_000) {
                bonusAmount += (sale - 10_000) * percent;
            }
        }
        return bonusAmount;
    }
}
