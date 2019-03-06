package SaleBonusService;

public class BonusService {
    public static void main(String[] args) {
        int[] sales = {12_000, 8_000, 15_000};
        double bonusAmount = 0;
        double percent = 0.05;
        for (int sale : sales) {
            if (sale > 10_000) {
                bonusAmount += (sale - 10_000) * percent;
            }
        }
        System.out.println(bonusAmount);
    }
}
