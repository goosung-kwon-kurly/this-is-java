package temp.src.ch05.sec01;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] { 1, 2, 3 };
        arr2 = new int[] { 1, 2, 3 };
        arr3 = arr2;

        System.out.println(arr1 == arr2); // arr1, arr2가 같은배열 참조하는지 확인
        System.out.println(arr2 == arr3); // arr2, arr3가 같은배열 참조하는지 확인
    }
}
