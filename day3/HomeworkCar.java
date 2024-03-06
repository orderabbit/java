package day3;

public class HomeworkCar {
    // 문제 : 자동차가 3번 달리게 해주세요.
    // 출력 : 자동차가 달립니다.
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car c1 = new Car();

        c1.run();
        c1.run();
        c1.run();

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car c2 = new Car();
        Car c3 = new Car();

        c1.run();
        c2.run();
        c3.run();

        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.

        Car2 car1 = new Car2();
        Car2 car2 = new Car2();

        car1.run(220);
        car2.run(250);
    }
}
class Car{
    public void run(){
        System.out.println("자동차가 달립니다");
    }
}
class Car2 {
    public void run(int speed) {
        System.out.println("자동차가 최대속력 " + speed + "km로 달립니다.");
    }
}
