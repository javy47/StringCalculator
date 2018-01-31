import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void AddTest(){
        //Empty String
        String testEmpty = " ";
        StringCalculator test = new StringCalculator();
        assertEquals(0,test.Add(testEmpty),"this should return 0");

        //One Item number
        String testOneItem = "31";
        assertEquals(31,test.Add(testOneItem),"this should return 31");
        //One Item "character"
        String testcharItem = "a";
        assertEquals(0,test.Add(testcharItem), "should return 0");



        //Two Items
        String testTwoItem = "1,2";
        assertEquals(3,test.Add(testTwoItem),"this should return 3");

        //More than Two Items
        //My add method will disregard letter characters if they are given as values and normal calculation occurs
        String testMultipleItem = "1,2,3,4,a";
        assertEquals(10,test.Add(testMultipleItem),"this should return 3");


    }


}