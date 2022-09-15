package test;

import com.company.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    public void testSum_1() {
        Fraction f1 = new Fraction(13,12);
        f1.multiply(new Fraction(7,5));
        assertEquals(91,f1.getX());
        assertEquals(60,f1.getY());
    }
    @Test
    public void testSum_2() {
        Fraction f1 = new Fraction(2,9);
        f1.multiply(new Fraction(5,6));
        assertEquals(5,f1.getX());
        assertEquals(27,f1.getY());
    }
    @Test
    public void testSum_3() {
        Fraction f1 = new Fraction(17,8);
        f1.multiply(new Fraction(9,1));
        assertEquals(153,f1.getX());
        assertEquals(8,f1.getY());
    }
    @Test
    public void testSum_4() {
        Fraction f1 = new Fraction(26,1);
        f1.multiply(new Fraction(14,13));
        assertEquals(28,f1.getX());
        assertEquals(1,f1.getY());
    }
    @Test
    public void testSum_5() {
        Fraction f1 = new Fraction(-33,9);
        f1.multiply(new Fraction(-7,12));
        assertEquals(77,f1.getX());
        assertEquals(36,f1.getY());
    }
    @Test
    public void testSum_6() {
        Fraction f1 = new Fraction(2,9);
        f1.multiply(new Fraction(-5,14));
        assertEquals(-5,f1.getX());
        assertEquals(63,f1.getY());
    }
    @Test
    public void testSum_7() {
        Fraction f1 = new Fraction(2,9);
        f1.multiply(new Fraction(-5,14,8));
        assertEquals(107,f1.getX());
        assertEquals(63,f1.getY());
    }
    @Test
    public void testSum_8() {
        Fraction f1 = new Fraction(9,81);
        f1.multiply(new Fraction(5,-14,34));
        assertEquals(157,f1.getX());
        assertEquals(42,f1.getY());
    }
    @Test
    public void testSum_9() {
        Fraction f1 = new Fraction(5,2,3);
        f1.multiply(new Fraction(2,4,6));
        assertEquals(143,f1.getX());
        assertEquals(4,f1.getY());
    }
    @Test
    public void testSum_10() {
        Fraction f1 = new Fraction(9,9);
        f1.multiply(new Fraction(5,-14,34));
        assertEquals(471,f1.getX());
        assertEquals(14,f1.getY());
    }
}