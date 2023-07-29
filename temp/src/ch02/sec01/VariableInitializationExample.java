package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value = 0; // 컴파일이 실패하지 않도록 변수 초기화 수정 로직 적용

        // 연산 결과를 변수 result 에 할당하지만 value 가 초기화되지 않음
        int result = value + 10;

        System.out.println(result);
    }
}
