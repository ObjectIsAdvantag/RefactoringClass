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
            return "Don".equals(person) || "John".equals(person);
    }




}
