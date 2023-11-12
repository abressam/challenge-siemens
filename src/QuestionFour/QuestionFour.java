package QuestionFour;

public class QuestionFour {
    private int CountCharactersInTheSamePosition(String s, String t) {
        int minLength = Math.min(s.length(), t.length());
        int countSameCharacter = 0;

        for (int i = 0; i < minLength; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                countSameCharacter++;
            } else {
                break;
            }
        }
        return countSameCharacter;
    }

}
