package albgorski.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaxbbbbyyhwawiwjjjwwm";
        assertEquals("3/56", Printer.printerError(s));
    }
}