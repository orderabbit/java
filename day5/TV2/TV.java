package day5.TV2;

// 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속받아 오버라이딩 해서 사용해야 한다.
abstract class 표준TV { // 추상클래스
    String brand;
    public void 이름세팅(){
    }
    public void 켜기(){
        System.out.println(brand + " 켜집니다.");
    }
    abstract public void 끄기();
}

class 샤오미TV extends 표준TV{ // 표준TV에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기때문에 오버라이딩 하지 않으면 실행 할 수 없음
    public void 이름세팅(){
        brand = "샤오미TV";
    }

    // 연산은 함수에서만 가능.
    // class에는 변수와 함수 선언만 가능.

    public void 끄기(){
        System.out.println("샤오미TV 꺼집니다.");
    }
    public void vr켜기(){
        System.out.println("샤오미TV vr켜기!");
    }
}

class 삼성TV extends 표준TV{
    public void 이름세팅(){
        brand = "삼성TV";
    }
    public void 끄기(){
        System.out.println("삼성TV 꺼집니다.");
    }
    public void ar켜기(){
        System.out.println("삼성TV ar켜기!");
    }
}

class LGTV extends 표준TV{
    public void 이름세팅(){
        brand = "LGTV";
    }
    public void 끄기(){
        System.out.println("LGTV 꺼집니다.");
    }
    public void 게임모드전환(){
        System.out.println("LGTV 게임모드전환!");
    }
}

