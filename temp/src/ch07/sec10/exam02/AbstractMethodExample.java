package temp.src.ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    //자동 타입변환 후 재정의된 메소드 호출
    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
