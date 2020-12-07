package main.tutorials.masterclass.junit.Challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utils;

    @Before
    public void setup() {
        utils = new Utilities();
        System.out.println("Setup object...");
    }

    @Test
    public void everyNthChar() {
        assertArrayEquals(new char[] {'e','l'},
                utils.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2));
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'},
                utils.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCAABDEEF"));
        assertNull("Null was not returned", utils.removePairs(null));
        assertEquals("A", utils.removePairs("A"));
        assertEquals("", utils.removePairs(""));
    }

    @Test  (expected = ArithmeticException.class)
    public void converter(){
        assertEquals(300, utils.converter(10, 5));
        utils.converter(10, 0);
    }

    @Test
    public void nullIfOddLength() {
        assertNull(utils.nullIfOddLength("hello"));
        assertNotNull(utils.nullIfOddLength("java"));
    }
}