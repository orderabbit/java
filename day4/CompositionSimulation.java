package day4;

public class CompositionSimulation {
    public static void main(String[] args) {

        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.파이썬();

        a홍길동.파이썬();

        // 이순신 주식회사 중복없이 만들기
        이순신주식회사 a이순신주식회사 = new 이순신주식회사();
        a이순신주식회사.파이썬(); // 파이썬 3.12
        a이순신주식회사.자바(); // 자바 17버전 프로그래밍

        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
    }
}
