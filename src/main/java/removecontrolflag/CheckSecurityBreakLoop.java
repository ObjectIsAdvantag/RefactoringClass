package removecontrolflag;

import java.util.Arrays;

/**
 * Created by Steve on 26/11/2015.
 */
public class CheckSecurityBreakLoop {
    public static boolean checkSecurity(String[] people) {
        for (String person : people) {
            if (isDonOrJohn(person)) return false;
        }
        return true;
    }

    static boolean isDonOrJohn(String person) {
            return "Don".equals(person) || "John".equals(person);
    }




}
