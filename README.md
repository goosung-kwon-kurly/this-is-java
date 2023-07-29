# 이것이 자바다 (책을 학습하며 예제 정리)  
## 1. History
### [2023.07.28]
*p15. Chapter 01 - Hello.java 예재 커밋*  
*p30. Chapter 01 - Calculator.java 예재*  
### [2023.07.29]
*p37. Chapter 02 - VariableInitializationExample.java 예재*  
*p37. Chapter 02 - VariableUseExample.java 예재*  
*p38. Chapter 02 - VariableExchangeExample.java 예재*  
*p39. Chapter 02 - 2.2 정수 타입*  
*p41. Chapter 02 - IntegerLiteralExample.java 예재*  
*p42. Chapter 02 - ByteExample.java 예재*  
*p43. Chapter 02 - LongExample.java 예재*  
*p44. Chapter 02 - CharExample.java 예재*  
*p45. Chapter 02 - 2.4 실수 타입*  
*p47. Chapter 02 - FloatDoubleExample.java 예재*  
*p48. Chapter 02 - BooleanExample.java 예재*  
*p50. Chapter 02 - StringExample.java 예재*  
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
#### Chapter 02 - VariableUseExample.java 예재
```java
package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = (hour*60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
```
```shell
#실행결과
3시간 5분
총 185분
```
### Chapter 02 - VariableExchangeExample.java 예재
```java
package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
```
```shell
#실행결과
x:3, y:5
x:5, y:3
```

### Chapter 02 - 2.2 정수 타입
#### Primitive 타입 8개
| 값의분류           | 기본 타입                      |
|----------------|------------------------------|
| 정수             | byte, char, short, int, long |
| 실수             | float, double                |
| 논리(true/false) | boolean                      |

#### 정수 타입 5개
<table>
 <thead>
  <tr>
   <td>타입</td>
   <td colspan="2">메모리 크기</td>
   <td colspan="2">저장되는 값의 허용 범위</td>
  </tr>
 </thead>
 <tbody>
  <tr>
   <td>byte</td>
   <td>1byte*</td>
   <td>8bit</td>
   <td>-2<sup>7</sup> ~ (2<sup>7</sup>-1)</td>
   <td>-128 ~ 127</td>
  </tr>
  <tr>
   <td>short</td>
   <td>2byte</td>
   <td>16bit</td>
   <td>-2<sup>15</sup> ~ (2<sup>15</sup>-1)</td>
   <td>-32,768 ~ 32,767</td>
  </tr>
  <tr>
   <td>char</td>
   <td>2byte</td>
   <td>16bit</td>
   <td>0 ~ (2<sup>16</sup>-1)</td>
   <td>0 ~ 65535 (유니코드)</td>
  </tr>
  <tr>
   <td>int</td>
   <td>4byte</td>
   <td>32bit</td>
   <td>-2<sup>31</sup> ~ (2<sup>31</sup>-1)</td>
   <td>-2,147,483,648 ~ 2,147,483,647</td>
  </tr>
  <tr>
   <td>long</td>
   <td>8byte</td>
   <td>64bit</td>
   <td>-2<sup>63</sup> ~ (2<sup>63</sup>-1)</td>
   <td>-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807</td>
  </tr>
 </tbody>
</table>
* 1bype = 8bit, bit는 0과 1이 저장되는 단위  

#### 진수 표현
2진수: *0b* 또는 *0B* 로 시작하고 *0*과 *1*로 작성
```java
int x = 0b1011;     // 10진수로 변환시 11
int y = 0B10100;    // 10진수로 변환시 20
```

8진수: *0* 으로 시작하고 *0~7* 숫자로 작성
```java
int x = 013;     // 10진수로 변환시 11
int y = 0206;    // 10진수로 변환시 134
```

10진수: 소수점이 없는 *0~9* 숫자로 작성
```java
int x = 12;
int y = 365;
```

16진수: *0x* 또는 *0X* 로 시작하고 *0~9* 숫자와 *A~F* 또는 *a~f* 로 작성
```java
int x = 0xB3;       // 10진수로 변환시 179
int y = 0x2A0F;     // 10진수로 변환시 10767
```

### Chapter 02 - IntegerLiteralExample.java 예재
```java
package ch02.sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1101;  //2진수
        int var2 = 0206;    //8진수
        int var3 = 365;     //10진수
        int var4 = 0xB3;    //16진수

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
```
```shell
#실행결과
var1: 13
var2: 134
var3: 365
var4: 179
```

### Chapter 02 - ByteExample.java 예재
```java
package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        byte var6 = 128;    //컴파일 에러(Type mismatch: cannot convert from int to byte)

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
        System.out.println("var6: " + var6);
    }
}
```
```shell
#실행결과
java: incompatible types: possible lossy conversion from int to byte
```

### Chapter 02 - LongExample.java 예재
```java
package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        long var3 = 1000000000000;  //컴파일러는 int로 간주하기 때문에 에러 발생
        long var4 = 1000000000000L;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
```
```shell
#실행결과
java: integer number too large
```

### Chapter 02 - CharExample.java 예재
```java
package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 65;

        char c3 = '가';
        char c4 = 44032;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
```
```shell
#실행결과
A
A
가
가
```
### Chapter 02 - 2.4 실수 타입
#### 실수 타입 2개
<table>
 <thead>
  <tr>
   <td>타입</td>
   <td colspan="2">메모리 크기</td>
   <td>저장되는 값의 허용 범위(양수 기준)</td>
   <td>유효 소수 이하 자리</td>
  </tr>
 </thead>
 <tbody>
  <tr>
   <td>float</td>
   <td>4byte</td>
   <td>32bit</td>
   <td>1.4 x 10<sup>-45</sup> ~ 3.4 x 10<sup>38</sup></td>
   <td>7자리</td>
  </tr>
  <tr>
   <td>double</td>
   <td>8byte</td>
   <td>64bit</td>
   <td>4.9 x 10<sup>-324</sup> ~ 1.8 x 10<sup>308</sup></td>
   <td>15자리</td>
  </tr>
 </tbody>
</table>

#### 10진수 리터럴
```java
double x = 0.25;
double y = -3.14;
```

#### e 또는 E가 포함된 10의 거듭제곱 리터럴
```java
double x = 5e2;         // 500.0
double y = 0.12E-2;     // 0.0012
```

#### 컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에 float 타입에 대입하고 싶다면 리터럴 뒤에 소문자 'f'나 대문자 'F'를 붙여 컴파일러가 float 타입임을 알 수 있도록 해야 한다.
```java
float var = 3.14f;
float var = 3E6F;
```

### Chapter 02 - FloatDoubleExample.java 예재
```java
package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }
}
```
```shell
#실행결과
var1: 0.12345679
var2: 0.12345678901234568
var3: 3000000.0
var4: 3000000.0
var5: 0.002
```

### Chapter 02 - BooleanExample.java 예재
```java
package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if(stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 " + result1);
        System.out.println("result2 " + result2);
    }
}
```
```shell
#실행결과
중지합니다.
result1 false
result2 true
```

### Chapter 02 - StringExample.java 예재
```java
package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다.\n");
    }
}
```
```shell
#실행결과
홍길동
프로그래머
나는 "자바"를 배웁니다.
번호	이름	직업
나는
자바를
배웁니다.
```