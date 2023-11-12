package QuestionFour;

public class QuestionFour {
    public static String ConcatRemove(String s, String t, int k) {
        int countSameCharacter = CountCharactersInTheSamePosition(s, t);

        int totalOperations = (s.length() - countSameCharacter) + (t.length() - countSameCharacter);

        boolean isKWithinValidTotalOperations = (k - totalOperations) % 2 == 0;
        boolean isKWithinTotalLength = k >= s.length() + t.length();

        if ((totalOperations <= k && isKWithinValidTotalOperations) || isKWithinTotalLength) {
            return "yes";
        } else {
            return "no";
        }
    }
    private static int CountCharactersInTheSamePosition(String s, String t) {
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
