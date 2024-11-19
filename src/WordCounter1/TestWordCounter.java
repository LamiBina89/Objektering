package WordCounter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWordCounter {


        @Test
        public void testCharacterCounting() {

            WordCounter1 wordCounter = new WordCounter1();
            wordCounter.addLine("Hello World");
int expected = 11;
int actual = wordCounter.getTotalCharacters();
            assertEquals(11, wordCounter.getTotalCharacters(), "Totala tecken ska vara:" + expected);
        }


    }



