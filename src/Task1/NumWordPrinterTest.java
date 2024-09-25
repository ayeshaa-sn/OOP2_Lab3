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

    public void TestEvenLower(){
        Assert.assertEquals("Even", numWordPrinter.printWord(6,"default"));
    }



}