import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void AddTest(){

        String testEmpty = " ";
        StringCalculator test = new StringCalculator();
        assertEquals(0,test.Add(testEmpty),"this should return 0");

        String testOneItem = "0";

        String testTwoItem = "1,2";


    }


}