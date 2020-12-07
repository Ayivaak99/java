package main.tutorials.masterclass.junit.Challenge;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities util;
    private  String test;
    private String expected;

    public UtilitiesTestParameterized(String test, String expected) {
        this.expected = expected;
        this.test = test;
    }

    @Before
    public void setup() {
        util = new Utilities();
        System.out.println("Setup object");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @Test
    public void removePairs() throws Exception {
        assertEquals(expected, util.removePairs(test));
    }
}