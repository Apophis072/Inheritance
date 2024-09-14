import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1, s2;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000001", "Bob", "Smith", "Mr.", 1986, 12.60,26208);
        s2 = new SalaryWorker("000002","Sally", "Simpson", "Mrs.", 1960, 22.30, 46384);

    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay()
    {
        assertEquals(504.0, s1.calculateWeeklyPay(40));

    }

    @org.junit.jupiter.api.Test
    void setAnnualSalary()
    {
        s2.setAnnualSalary(60000);
        assertEquals(60000, s2.getAnnualSalary());
    }


    @Test
    void displayWeeklyPay()
    {
        s1.displayWeeklyPay(60);
        assertEquals("000001, Bob,Smith,Mr.,1986,12.6,26208.0", s1.toCSVRecord());
    }
}