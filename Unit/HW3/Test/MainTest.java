import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import hw.MainHW;

import static org.assertj.core.api.Assertions.assertThat;


public class MainTest {

    @Test
    void positiveNumber() {
        assertThat(MainHW.evenOddNumber(2)).isTrue();
    }

    @Test
    void negativeNumber() {
        assertThat(MainHW.evenOddNumber(3)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    void testIntervalTrue(int n) {
        assertThat(MainHW.numberInInterval(n)).isEqualTo(true);
}
    @ParameterizedTest
    @ValueSource(ints = {24, 101})
    void testIntervalFa(int n) {
        assertThat(MainHW.numberInInterval(n)).isEqualTo(false);
    }
}
