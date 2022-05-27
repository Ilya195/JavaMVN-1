import BonusService.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);


        Assertions.assertEquals(actual, expected);
    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();


        long amount = 2000;
        boolean notregistered = false;
        long expected = 20;
        long actual = service.calculate(amount, notregistered);

        Assertions.assertEquals(expected, actual);
    }
}