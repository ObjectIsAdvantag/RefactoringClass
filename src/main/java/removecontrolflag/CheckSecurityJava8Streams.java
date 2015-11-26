package removecontrolflag;

import java.util.Arrays;

/**
 * Created by Steve on 26/11/2015.
 */
public class CheckSecurityJava8Streams {
    public static boolean checkSecurity(String[] people) {
        try {
            Arrays.stream(people).forEach((person) -> {
                assert !isBlackListed(person) : "break loop";
            });
        }
        catch (AssertionError ae) {
           return false;
        }
        return true;
    }

    static boolean isBlackListed(String person) {
        return "Don".equals(person) || "John".equals(person);
    }




}
