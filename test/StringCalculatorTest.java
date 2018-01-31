import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void AddTest(){
        //Empty String
        String testEmpty = " ";
        StringCalculator test = new StringCalculator();
        assertEquals(0,test.Add(testEmpty),"this should return 0");
        //One Item
        String testOneItem = "31";
        assertEquals(31,test.Add(testOneItem),"this should return 31");
        //Two Items
        String testTwoItem = "1,2";
        assertEquals(3,test.Add(testTwoItem),"this should return 3");

    }


}