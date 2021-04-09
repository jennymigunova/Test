package usa.alex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Double_loopTest {

    @Test
    void calculate() {
        Double_loop loop = new Double_loop();
        String actual = loop.calculateLoop();
        String expected = "-1-2-3-4-5-6-7-8-9-";
        assertEquals(expected, actual);
    }
}