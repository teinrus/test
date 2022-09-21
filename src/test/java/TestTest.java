import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTest {


    @AfterAll
    static void setUpApp() {
        System.out.println("Запускаюсь после выполнения всех тестов...");
    }

    @Test
    @DisplayName("Тестирование УCН")
    void taxUsn() {

        Assertions.assertEquals(6, Main.taxUsn(100));
        System.out.println("результат совпал по УСН");
    }

    @Test
    @DisplayName("Тестирование c НДС")
    void taxEarningsMinusSpendings() {
        Assertions.assertEquals(13, Main.taxEarningsMinusSpendings(100, 10));
        System.out.println("результат совпал по НДС");
    }


}