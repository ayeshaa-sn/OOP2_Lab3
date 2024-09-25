package Task1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumWordPrinterTest {
    NumWordPrinter numWordPrinter=new NumWordPrinter();
    @Test

    public void TestEvenUpper(){
        Assert.assertEquals("EVEN", numWordPrinter.printWord(4,"uppercase"));
    }

    @Test

    public void TestEvenDefault(){
        Assert.assertEquals("Even", numWordPrinter.printWord(6,"default"));
    }

    @Test
    void testEvenPrimeLuckyUpper() {
        assertEquals("EVENPRIMELUCKY", numWordPrinter.printWord(2 * 11 * 13, "UPPERCASE"));
    }

    @Test
    void testEvenPrimeLuckyDefault() {
        assertEquals("EvenPrimeLucky", numWordPrinter.printWord(2 * 11 * 13, "DEFAULT"));
    }

    @Test
    void testPrimeElevenDefault() {
        assertEquals("PrimeEleven", numWordPrinter.printWord(11, "DEFAULT"));

    }

    @Test
    void testPrimeElevenUpper() {
        assertEquals("PRIMEELEVEN", numWordPrinter.printWord(11, "UPPERCASE"));

    }

    @Test
    void testLuckyThirteenUpper() {
        assertEquals("LUCKYTHIRTEEN", numWordPrinter.printWord(13, "UPPERCASE"));
    }


    @Test
    void testLuckyThirteenDefault() {
        assertEquals("LuckyThirteen", numWordPrinter.printWord(13, "default"));
    }

    @Test
    void testOddOneOut() {
        assertEquals("OddOneOut", numWordPrinter.printWord(3, "DEFAULT"));
        assertEquals("ODDONEOUT", numWordPrinter.printWord(3, "UPPERCASE"));
    }






}