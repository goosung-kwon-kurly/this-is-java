package temp.src.ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1>10) {
            int v2 = v1 -10;
        }
        //에러발생부분 주석처리
        //int v3 = v1 + v2 + 5;
    }
}
