package day4;

public class Composition {

}
class 홍길동{

    홍길순 a홍길순 = new 홍길순();

    public void 자바(){
        System.out.println("자바 17버전 프로그래밍");
    }
    public void 파이썬(){
        a홍길순.파이썬();
    }
}

class 홍길순{
    public void 파이썬(){
        System.out.println("파이썬 3.12 프로그래밍");
    }
}

class 이순신주식회사{
    홍길동 b홍길동 = new 홍길동();
    홍길순 b홍길순 = new 홍길순();
    public void 자바(){
        b홍길동.자바();
    }

    public void 파이썬(){
        b홍길순.파이썬();
    }
}

class 사람{
    public void 나이() {

    }
}

class 팔{

}
