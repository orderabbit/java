package day6;

import java.util.Scanner;

public class StringInputExam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력해주세요 : ");
        String name = scan.nextLine();
        System.out.println("나이를 입력해주세요 : ");
        int age = scan.nextInt();

        System.out.printf("안녕하세요 %d세 %s입니다.\n",age, name);
        // v1
        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        System.out.println("나이를 입력해주세요 : ");
        int age2 = scan.nextInt();

        scan.nextLine(); // 버퍼 비우기

        System.out.println("이름을 입력해주세요 : ");
        String name2 = scan.nextLine();

        System.out.printf("안녕하세요 %d세 %s입니다.\n",age2, name2);
        // v2
        // 나이를 입력해주세요 : 29
        // 이름을 입력해주세요 : 홍 길동
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 버퍼 찌꺼기 때문에 입력이 꼬이는 것 해별방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine 으로 통일한다
    }
}
