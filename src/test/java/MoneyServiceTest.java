import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netolodgy.qa.javaqa5.services.MoneyService;

public class MoneyServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/money.csv")

    public void testMoneyMonth (int income, int expenses, int threshold, int expected) {
        MoneyService service = new MoneyService();

        int actual = service.calculate (income, expenses, threshold, expected);

        Assertions.assertEquals(expected, actual);

    }

}
