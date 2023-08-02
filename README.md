# 이것이 자바다 (책을 학습하며 예제 정리)  
## 1. History
### [2023.07.28]
*p15. [Chapter 01 - Hello.java 예재](#p15-chapter-01---hellojava-예재)*  
*p30. [Chapter 01 - Calculator.java 예재](#p30-chapter-01---calculatorjava-예재)*  
### [2023.07.29]
*p37. [Chapter 02 - VariableInitializationExample.java 예재](#chapter-02---variableinitializationexamplejava-예재)*  
*p37. [Chapter 02 - VariableUseExample.java 예재](#chapter-02---variableuseexamplejava-예재)*  
*p38. [Chapter 02 - VariableExchangeExample.java 예재](#chapter-02---variableexchangeexamplejava-예재)*  
*p39. [Chapter 02 - 2.2 정수 타입](#chapter-02---22-정수-타입)*  
*p41. [Chapter 02 - IntegerLiteralExample.java 예재](#chapter-02---integerliteralexamplejava-예재)*  
*p42. [Chapter 02 - ByteExample.java 예재](#chapter-02---byteexamplejava-예재)*  
*p43. [Chapter 02 - LongExample.java 예재](#chapter-02---longexamplejava-예재)*  
*p44. [Chapter 02 - CharExample.java 예재](#chapter-02---charexamplejava-예재)*  
*p45. [Chapter 02 - 2.4 실수 타입](#chapter-02---24-실수-타입)*  
*p47. [Chapter 02 - FloatDoubleExample.java 예재](#chapter-02---floatdoubleexamplejava-예재)*  
*p48. [Chapter 02 - BooleanExample.java 예재](#chapter-02---booleanexamplejava-예재)*  
*p50. [Chapter 02 - StringExample.java 예재](#chapter-02---stringexamplejava-예재)*  
*p51. [Chapter 02 - TextBlockExample.java 예재](#chapter-02---textblockexamplejava-예재)*  
### [2023.07.29]
*p53. [Chapter 02 - 2.7 자동 타입_변환](#chapter-02---27-자동-타입-변환)*  
### [2023.08.02]
*p54. [Chapter 02 - PromotionExample.java 예재](#chapter-02---promotionexamplejava-예재)*  
*p58. [Chapter 02 - CastingExample.java 예재](#chapter-02---castingexamplejava-예재)*  
*p62. [Chapter 02 - OperationPromotionExample.java 예재](#chapter-02---operationpromotionexamplejava-예재)*  
*p64. [Chapter 02 - StringConcatExample.java 예재](#chapter-02---stringconcatexamplejava-예재)*  
*p65. [Chapter 02 - PrimitiveAndStringConversionExample.java 예재](#chapter-02---primitiveandstringconversionexamplejava-예재)*  
*p67. [Chapter 02 - VariableScopeExample.java 예재](#chapter-02---variablescopeexamplejava-예재)*  
*p69. [Chapter 02 - PrintExample.java 예재](#chapter-02---printexamplejava-예재)*  
*p71. [Chapter 02 - ScannerExample.java 예재](#chapter-02---scannerexamplejava-예재)*  

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

### Chapter 02 - TextBlockExample.java 예재
```java
package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("-----------------------------");
        System.out.println(str2);
        System.out.println("-----------------------------");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);
    }
}
```
```shell
#실행결과
{
	"id":"winter",
	"name":"눈송이"
}
-----------------------------
{
    "id":"winter",
    "name":"눈송이"
}

-----------------------------
나는 자바를 학습합니다.
나는 자바 고수가 될 겁니다.
```
### Chapter 02 - 2.7 자동 타입 변환
기본 타입을 허용 범위 순으로 나열
```text
byte < short < char < int < long < float < double
```

### Chapter 02 - PromotionExample.java 예재
```java
package temp.src.ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}
```
```shell
#실행결과
intValue: 10
가의 유니코드: 44032
longValue: 50
floatValue: 100.0
doubleValue: 100.5
```

### Chapter 02 - CastingExample.java 예재
```java
package temp.src.ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
```
```shell
#실행결과
10
300
A
3
```

### Chapter 02 - OperationPromotionExample.java 예재
```java
package temp.src.ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3: " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);

        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;
        System.out.println("result7: " + result7);
    }
}
```
```shell
#실행결과
result1: 30
result2: 30
result3: 1110
result4: 66
result4: B
result5: 2
result6: 2.5
result7: 0.5
```

### Chapter 02 - StringConcatExample.java 예재
```java
package temp.src.ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);
    }
}
```
```shell
#실행결과
result1: 20
result2: 128
result3: 1028
result4: 1028
result5: 1010
```

### Chapter 02 - PrimitiveAndStringConversionExample.java 예재
```java
package temp.src.ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
```
```shell
#실행결과
value1: 10
value2: 3.14
value3: true
str1: 10
str2: 3.14
str3: true
```

### Chapter 02 - VariableScopeExample.java 예재
```java
package temp.src.ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1>10) {
            int v2 = v1 -10;
        }
        int v3 = v1 + v2 + 5;
    }
}
```
```shell
#실행결과
java: cannot find symbol
  symbol:   variable v2
  location: class temp.src.ch02.sec11.VariableScopeExample
```

### Chapter 02 - PrintExample.java 예재
```java
package temp.src.ch02.sec12;

public class PrintExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);
        System.out.printf("상품의 가격:%-6d원\n", value);
        System.out.printf("상품의 가격:%06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
```
```shell
#실행결과
상품의 가격:123원
상품의 가격:   123원
상품의 가격:123   원
상품의 가격:000123원
반지름이 10인 원의 넓이:    314.16
     1 | 홍길동        |         도적
```

### Chapter 02 - ScannerExample.java 예재
```java
package temp.src.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while(true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");
    }
}
```
```shell
#실행결과
x 값 입력: 3
y 값 입력: 5
x + y: 8

입력 문자열: Hello
출력 문자열: Hello

입력 문자열: 안녕하세요
출력 문자열: 안녕하세요

입력 문자열: q
종료
```