package day5;

public class Constructor2 {
    public static void main(String[] args) {
        사람2 a사람 = new 사람2();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔();

        System.out.println(a사람.a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

class 사람2{
    int 나이;
    public 팔 a왼팔;
}

class 팔{
    int 길이 = 100;
}