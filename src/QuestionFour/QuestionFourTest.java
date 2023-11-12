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
}
