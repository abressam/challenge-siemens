package QuestionEleven;

public class QuestionEleven {
    public String reverseString(String inputString) {
        char[] charArray = inputString.toCharArray();
        int length = 0;

        for (char character : charArray) {
            length++;
        }

        int endIndex = 0;
        while (endIndex < length && charArray[endIndex] != '\0') {
            endIndex++;
        }

        for (int i = 0; i < endIndex / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[endIndex - i - 1];
            charArray[endIndex - i - 1] = temp;
        }

        return new String(charArray, 0, endIndex);
    }
}
