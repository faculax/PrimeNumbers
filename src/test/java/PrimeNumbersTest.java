/**
 * Created by Facundo Laxalde.
 */
import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

public class PrimeNumbersTest {

    ArrayList<Integer> tenPrimes = new ArrayList<Integer>();
    ArrayList<Integer> elevenPrimes = new ArrayList<Integer>();
    ArrayList<Integer> twelvePrimes = new ArrayList<Integer>();
    @Before
    public void initialize() {
        tenPrimes.add(2);
        tenPrimes.add(3);
        tenPrimes.add(5);
        tenPrimes.add(7);
        tenPrimes.add(11);
        tenPrimes.add(13);
        tenPrimes.add(17);
        tenPrimes.add(19);
        tenPrimes.add(23);
        tenPrimes.add(29);

        elevenPrimes.add(2);
        elevenPrimes.add(3);
        elevenPrimes.add(5);
        elevenPrimes.add(7);
        elevenPrimes.add(11);
        elevenPrimes.add(13);
        elevenPrimes.add(17);
        elevenPrimes.add(19);
        elevenPrimes.add(23);
        elevenPrimes.add(29);
        elevenPrimes.add(31);

        twelvePrimes.add(2);
        twelvePrimes.add(3);
        twelvePrimes.add(5);
        twelvePrimes.add(7);
        twelvePrimes.add(11);
        twelvePrimes.add(13);
        twelvePrimes.add(17);
        twelvePrimes.add(19);
        twelvePrimes.add(23);
        twelvePrimes.add(29);
        twelvePrimes.add(31);
        twelvePrimes.add(37);
    }

    @Test
    public void testGetInstance() {
        Assert.assertNotNull(PrimeNumbers.getInstance());
    }

    @Test
    public void testTenPrimes() {
        PrimeNumbers.getInstance().calculateFirstNPrimes(10);
        Assert.assertNotNull(PrimeNumbers.getInstance());
        Assert.assertEquals(PrimeNumbers.getInstance().getTenPrimes(), tenPrimes);
    }

    @Test
    public void testElevenPrimes() {
        PrimeNumbers.getInstance().calculateFirstNPrimes(11);
        Assert.assertNotNull(PrimeNumbers.getInstance());
        Assert.assertEquals(PrimeNumbers.getInstance().getAllPrimesAvailable(), elevenPrimes);
    }

    @Test
    public void testTwelvePrimes() {
        PrimeNumbers.getInstance().calculateFirstNPrimes(12);
        Assert.assertNotNull(PrimeNumbers.getInstance());
        Assert.assertEquals(PrimeNumbers.getInstance().getAllPrimesAvailable(), twelvePrimes);
    }

    @Test
    public void testTenPrimesAgain() {
        PrimeNumbers.getInstance().calculateFirstNPrimes(10);
        Assert.assertNotNull(PrimeNumbers.getInstance());
        Assert.assertEquals(PrimeNumbers.getInstance().getTenPrimes(), tenPrimes);
    }
}
