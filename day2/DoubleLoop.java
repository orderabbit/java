package day2;

public class DoubleLoop {
    public static void main(String[] args) {

        // 1부터 5까지 3번반복출력
        for(int i = 0; i < 3; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println(j);
            }
        }

        // 구구단 2단 출력
        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

        // 구구단 2 ~ 9단 출력
        for(int dan2 = 2; dan2 < 10; dan2++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan2 + " X " + i + " = " + (dan2 * i));
            }
        }
    }
}
