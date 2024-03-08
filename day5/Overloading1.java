package day5;

public class Overloading1 {
    public static void main(String[] args) {

        new 사람6();
        // 아래와 같이 출력되게 해주세요.


        // 동물(String 이름, int 나이) 실행됨!
        // 이름 : 홍길동
        // 나이 : 27
    }
}

class 동물2 {

    동물2(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물2(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람6 extends 동물2 {
    public 사람6() {
        super("홍길동", 27);
    }
}

