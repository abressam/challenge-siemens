package QuestionTen;

public class QuestionTen {
    public static int getStringLength(String inputString) {
        int length = 0;

        for (char character : inputString.toCharArray()) {
            length++;
        }
        return length;
    }
}
