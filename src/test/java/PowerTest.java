import org.junit.Test;
import powerpackage.PowerFinder;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_Is_nine() {
        assert PowerFinder.of(3, 2) == 9;
    }
}
