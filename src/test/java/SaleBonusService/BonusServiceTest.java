package SaleBonusService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculate() {
        BonusService service = new BonusService();
        double[] sales = {12_000, 8_000, 15_000};

        double bonus = service.calculate(sales);

        assertEquals(350.0, bonus);
    }

}