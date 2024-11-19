package WordCounter1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmptyLine {


    @Test
    public void testEmptyLines() {
     WordCounter1 wordCounter = new WordCounter1();
     String line ="";
     wordCounter.addLine(line);


     assertEquals(0, wordCounter.getTotalCharacters(), "Total tecken borde vara 0");
assertEquals(1, wordCounter.getTotalLines(), "Total rader borde vara 1");



    }



}
