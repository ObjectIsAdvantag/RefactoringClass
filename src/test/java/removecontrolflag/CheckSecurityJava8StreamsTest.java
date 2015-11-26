package removecontrolflag;

import static org.junit.Assert.*;

/**
 * Created by Steve on 26/11/2015.
 */
public class CheckSecurityJava8StreamsTest {

    @org.junit.Test
    public void testCheckSecurity() throws Exception {
        String[] people1 = { "me", "you", "them" };
        assertTrue(CheckSecurityJava8Streams.checkSecurity(people1));

        String[] people2 = { "me", "you", "Don"};
        assertFalse(CheckSecurityJava8Streams.checkSecurity(people2));
    }

    @org.junit.Test
    public void testIsDonOrJohn() throws Exception {
        assertTrue(CheckSecurityJava8Streams.isBlackListed("Don"));
        assertTrue(CheckSecurityJava8Streams.isBlackListed("John"));
        assertFalse(CheckSecurityJava8Streams.isBlackListed("Stève"));
    }
}