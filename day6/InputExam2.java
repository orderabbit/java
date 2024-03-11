package day6;

import java.util.Scanner;

public class InputExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("단을 입력해주세요 : ");
        int dan = scan.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }
    }
}
