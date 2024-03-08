package day5;

public class Constructor3 {
    public static void main(String[] args) {

        new 사람3().걷다();

        System.out.println(new 사람3().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

class 사람3 {
    public 사람3() {
    }
    void 걷다() {
        System.out.println("사람 걷는다.");
        }
    팔2 a왼팔 = new 팔2();
}

class 팔2 {
    int 길이 = 100;
}

