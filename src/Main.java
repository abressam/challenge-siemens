import QuestionEleven.QuestionEleven;
import QuestionFour.QuestionFour;
import QuestionTen.QuestionTen;
import QuestionThree.QuestionThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Question Three");
            System.out.println("2. Question Four");
            System.out.println("3. Question Ten");
            System.out.println("4. Question Eleven");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    // Question Three
                    QuestionThree questionThree = new QuestionThree();
                    questionThree.fooBaaPrintByRange();
                    System.out.println("\n");
                    break;

                case 2:
                    // Question Four
                    System.out.println("Enter strings and an integer (space-separated):");
                    String s = scanner.nextLine().replaceAll(" ","");
                    String t = scanner.nextLine().replaceAll(" ","");
                    int k = Integer.parseInt(scanner.nextLine());

                    QuestionFour questionFour = new QuestionFour();
                    String resultFour = questionFour.ConcatRemove(s, t, k);
                    System.out.println("Result: " + resultFour);
                    System.out.println("\n");
                    break;

                case 3:
                    // Question Ten
                    System.out.println("Enter a string:");
                    String inputString = scanner.nextLine();
                    QuestionTen questionTen = new QuestionTen();
                    int resultTen = questionTen.getStringLength(inputString);
                    System.out.println("Result: " + resultTen);
                    System.out.println("\n");
                    break;

                case 4:
                    // Question Eleven
                    System.out.println("Enter a string:");
                    inputString = scanner.nextLine();
                    QuestionEleven questionEleven = new QuestionEleven();
                    String resultEleven = questionEleven.reverseString(inputString);
                    System.out.println("Result: " + resultEleven);
                    System.out.println("\n");
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 0);
    }
}