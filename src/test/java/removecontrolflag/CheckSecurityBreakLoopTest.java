package removecontrolflag;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Steve on 26/11/2015.
 */
public class CheckSecurityBreakLoopTest {

    @Test
    public void testCheckSecurity() throws Exception {
        String[] people1 = { "me", "you", "them" };
        assertTrue(CheckSecurityJava8Streams.checkSecurity(people1));

        String[] people2 = { "me", "you", "Don"};
        assertFalse(CheckSecurityJava8Streams.checkSecurity(people2));
    }

}