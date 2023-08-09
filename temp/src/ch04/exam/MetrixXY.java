package temp.src.ch04.exam;

public class MetrixXY {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }

        System.out.println("프로그램 종료");
    }
}
