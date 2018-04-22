package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class MainTest {
    @Test
    public void testThatTaxWasAddedCorrectly() throws Exception {
        MaamResolver maamResolver = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolver.getMaam()).thenReturn(0.18);
        TaxCalculator taxCalculator = new TaxCalculatorImpl(maamResolver);
        Money money = new Money(100);

        Money withMaam = taxCalculator.addMaam(money);
        Assert.assertEquals(118,withMaam.getAmount(),0.00001);
    }
}