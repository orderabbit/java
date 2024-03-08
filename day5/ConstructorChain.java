package day5;

public class ConstructorChain {
    public static void main(String[] args) {

        고양이 a고양이 = new 고양이();
    }
}

class 동물{
    public 동물(){
        System.out.println("동물이 생성되었습니다.");
    }
}

class 고양이 extends 동물{
    public 고양이(){
        super(); // 부모의 생성자 호출
        System.out.println("고양이가 생성되었습니다.");
    }
}