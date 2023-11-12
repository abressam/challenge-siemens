package QuestionThree;

public class QuestionThree {
    public void fooBaaPrintByRange() {
        for (int i = 1; i <= 100; i++) {
            String resp = "";

            if (this.multipleValidator(i, 3)) {
                resp += "Foo";
            }

            if (this.multipleValidator(i, 5)) {
                resp += "Baa";
            }

            if (resp.isEmpty()) {
                resp += i;
            }

            System.out.println(resp);
        }
    }
    private boolean multipleValidator(int number, int multiple) {
        return number % multiple == 0;
    }
}
