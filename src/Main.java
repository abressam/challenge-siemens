import QuestionFour.QuestionFour;
import QuestionTen.QuestionTen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        QuestionThree questionThree = new QuestionThree();
//        questionThree.fooBaaPrintByRange();

        Scanner scanner = new Scanner(System.in);

//        String s = scanner.nextLine().replaceAll(" ","");
//        String t = scanner.nextLine().replaceAll(" ","");
//        int k = Integer.parseInt(scanner.nextLine());
//
//        QuestionFour questionFour = new QuestionFour();
//        String result = questionFour.ConcatRemove(s, t, k);
//
//        System.out.println(result);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        QuestionTen questionTen = new QuestionTen();
        int result = questionTen.getStringLength(inputString);

        System.out.println(result);

    }
}