# 이것이 자바다 (책을 학습하며 예제 정리)  
## 1. History
#### *[2023.07.28] p15. Chapter 01 - Hello.java 예재 커밋*
###
## 2. 실습내용 정리
### p15. Chapter 01 - Hello.java 예재 커밋
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