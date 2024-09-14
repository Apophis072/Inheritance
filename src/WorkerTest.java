import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker worker1, worker2;
    @BeforeEach
    void setup()
    {
     worker1 = new Worker("000001","Bob", "Smith", "Mr.", 1989, 12.60);
     worker2 = new Worker("000002","Lisa", "Garcia", "Mrs.", 1973, 22.40);
    }

    @org.junit.jupiter.api.Test
    void setHourlyPayRate()
    {
     worker1.setHourlyPayRate(300.50);
     assertEquals(300.50, worker1.getHourlyPayRate());
    }

    @org.junit.jupiter.api.Test
    void setTotalPay() {
        worker2.setTotalPay(300000);
        assertEquals(300000, worker2.getTotalPay());
    }

    @org.junit.jupiter.api.Test
    void setRegularPay() {
        worker1.setRegularPay(40000);
        assertEquals(40000,worker1.getRegularPay());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        worker2.calculateWeeklyPay(40);
        assertEquals(896, worker2.getRegularPay());
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        worker1.displayWeeklyPay(50);
        assertEquals("000001, Bob,Smith,Mr.,1989,12.6", worker1.toCSVRecord());
    }
}