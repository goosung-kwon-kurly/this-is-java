package temp.src.ch06.sec09;

public class Car {
    String model;
    int speed;

    //생성자 선언
    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다. (시속:" + this.speed + "km/h");
    }
}
