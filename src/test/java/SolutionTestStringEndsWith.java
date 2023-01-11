import com.example.kata_java.StringEndsWith;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTestStringEndsWith {
    @Test
    public void staticTests() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }

    @Test
    public void goodPracticeStaticTests() {
        goodPracticeCheck("samurai", "ai", true);
        goodPracticeCheck("sumo", "omo", false);
        goodPracticeCheck("ninja", "ja", true);
        goodPracticeCheck("sensei", "i", true);
        goodPracticeCheck("samurai", "ra", false);
        goodPracticeCheck("abc", "abcd", false);
        goodPracticeCheck("abc", "abc", true);
        goodPracticeCheck("abcabc", "bc", true);
        goodPracticeCheck("ails", "fails", false);
        goodPracticeCheck("fails", "ails", true);
        goodPracticeCheck("this", "fails", false);
        goodPracticeCheck("this", "", true);
        goodPracticeCheck(":-)", ":-(", false);
        goodPracticeCheck("!@#$%^&*() :-)", ":-)", true);
        goodPracticeCheck("abc\n", "abc", false);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = StringEndsWith.stringEndsWith(str, ending);
        assertEquals(expected, result, "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
    }

    private static void goodPracticeCheck(String str, String ending, boolean expected) {
        boolean result = StringEndsWith.goodPracticeStringEndsWith(str, ending);
        assertEquals(expected, result, "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
    }
}