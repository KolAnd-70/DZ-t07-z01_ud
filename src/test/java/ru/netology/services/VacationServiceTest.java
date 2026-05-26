import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class VacationServiceTest {

    @Test
    public void test() {
        VacationService sarvice = new VacationService();

        int actual = service.calculate(
                income:10_000,
                expenses:3_000,
                threshold:20_000);
        int expected = 3;

        Assertions.assertEquals(expуcted actual);
    }
}

