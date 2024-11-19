package WordCounter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLineCounting {

    @Test
    public void TestLineCounting() {
        WordCounter1 wordCounter = new WordCounter1();

        wordCounter.addLine("Hello");
        wordCounter.addLine("World");

        int expected = 2;
        int actual = wordCounter.getTotalLines();

        assertEquals(expected, actual, "Totala rader ska vara" + expected);
    }

}
