# 이것이 자바다 (책을 학습하며 예제 정리)  
## 1. History
### [2023.07.28]
*p15. Chapter 01 - Hello.java 예재 커밋*  
*p30. Chapter 01 - Calculator.java 예재*  
### [2023.07.29]
*p37. Chapter 02 - VariableInitializationExample.java 예재*  
###
## 2. 실습내용 정리
### p15. Chapter 01 - Hello.java 예재
```java
package ch01.sec06;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
    }
}
```
```shell
# 컴파일 할때 아래와 같이 사용
# javac -d [바이트코드파일 저장위치] [소스경로/*.java]
$ javac -d bin src/ch01/sec06/Hello.java

(출력없이 정해진 패키지 경로로 .class 파일 생성)
```

```shell
# 바이트코드 실행 시
# java -cp [바이트코드파일 저장위치] [패키지...클래스명]
$ java -cp bin ch01.sec06.Hello

Hello, Java
```

### p30. Chapter 01 - Calculator.java 예재
```java
package ch01.sec12;

public class Calculator {
    public static void main(String[] args) {
        int x = 1;                  //변수 x 선언, 1 저장
        int y = 2;                  //변수 y 선언, 2 저장
        int result = x + y;         //변수 result 선언, x + y 수행 결과 저장
        System.out.println(result); //변수 result 의 값을 화면에 출력
    }
}
```
```shell
$ java -cp bin ch01.sec12.Calculator 

3
```
### Chapter 02 - VariableInitializationExample.java 예재
```java
package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value;

        // 연산 결과를 변수 result 에 할당하지만 value 가 초기화되지 않음
        int result = value + 10;

        System.out.println(result);
    }
}
```
```shell
temp/src/ch01/sec01/VariableInitializationExample.java:7:22

#실행결과
java: variable value might not have been initialized
```
