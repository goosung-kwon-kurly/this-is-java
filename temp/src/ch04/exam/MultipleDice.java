package temp.src.ch04.exam;

public class MultipleDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;

        while (true) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            System.out.println("(" + dice1 + ", " + dice2 + ")");

            if (dice1 + dice2 == 5) {
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
