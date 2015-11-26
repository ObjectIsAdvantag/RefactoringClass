package removecontrolflag;

/**
 * Created by Steve on 26/11/2015.
 */
public class CheckSecurityBreakLoop {
    public static boolean checkSecurity(String[] people) {
        for (String person : people) {
            if (isBlackListed(person)) return false;
        }
        return true;
    }

    static boolean isBlackListed(String person) {
        switch (person) {
            case "Don":
            case "John":
                return true;
        }
        return false;
    }
}
