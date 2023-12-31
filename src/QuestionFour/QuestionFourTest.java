package QuestionFour;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuestionFourTest {
    @Test
    public void canConvertBasicScenario() {
        String s = "bla bla bla bla";
        String newS = s.replaceAll(" ","");
        String t = "blablabcde";
        int k = 8;

        assertEquals("yes", QuestionFour.ConcatRemove(newS, t, k));
    }
    @Test
    public void canConvertJustEnoughOperations() {
        String s = "abc";
        String t = "def";
        int k = 6;

        assertEquals("yes", QuestionFour.ConcatRemove(s, t, k));
    }

    @Test
    public void canConvertNotEnoughOperations() {
        String s = "abc";
        String t = "def";
        int k = 5;

        assertEquals("no", QuestionFour.ConcatRemove(s, t, k));
    }

    @Test
    public void canConvertExcessOperations() {
        String s = "abc";
        String t = "def";
        int k = 7;

        assertEquals("yes", QuestionFour.ConcatRemove(s, t, k));
    }

    @Test
    public void testCanConvertEmptyStrings() {
        String s = "";
        String t = "";
        int k = 0;

        assertEquals("yes", QuestionFour.ConcatRemove(s, t, k));
    }

    @Test
    public void testCanConvertEqualStrings() {
        String s = "xyz";
        String t = "xyz";
        int k = 6;

        assertEquals("yes", QuestionFour.ConcatRemove(s, t, k));
    }
}
