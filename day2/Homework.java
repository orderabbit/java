package day2;

public class Homework {
    public static void main(String[] args) {
        // 1부터 100까지 출력
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        // 1부터 100까지 짝수만 출력
        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 스트라이커 손흥민
        int time = 74;
        int score = 0;
        for(int i = 0; i < (90 - time) / 5; i++){
            score = score + i;
        }
        System.out.println(score);

        // a, b 사이의 수를 오름차순 출력
        int a = 12;
        int b = 5;
        for(int i = 0; i < 7; i++){
            for(int j = b+1; j < a; j++){
                System.out.println(j);
            }
        }

        // 1부터 100까지 짝수는 even, 홀수는 odd를 붙여서 출력
        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " : even");
            }
            else{
                System.out.println(i + " : odd");
            }
        }

        // 구구단 짝수번째만 곱하기.
        for(int dan = 2; dan < 10; dan++) {
            for (int i = 1; i <= 8; i ++) {
                if (i % 2 == 0) {
                    System.out.println(dan + " * " + i + " = " + (dan * i));
                }
            }
        }

        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력.

        //int n = 4; // 시작
        //int m = 20; // 끝
        //int limit = 10; // 곱의 개수
        for(int n = 4; n <= 20; n++) {
            for (int i = 1; i <= 10; i++) {
                if (n % 2 == 1 && i % 2 == 0) {
                    System.out.println(n + " * " + i + " = " + (n * i));
                }
            }
        }

        // 삼각형 그리기

      // 높이 : 3
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 높이 : 5
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 높이 : 7
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //
        for (int i = 1; i < 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        // 높이 : 5
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 높이 : 7
        for (int i = 1; i < 8; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 대칭
        int y = 3;
        for (int i = 1; i <= y; i++) {
            for (int j = y; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        y = 5;
        for (int i = 1; i <= y; i++) {
            for (int j = y; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        y = 7;
        for (int i = 1; i <= y; i++) {
            for (int j = y; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 배열에 값 저장하기
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 배열값 3번 출력
        int[] arr2 = {1, 2, 3, 4, 5};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < arr2.length; j++){
                System.out.println(arr2[j]);
            }
        }

        // 배열값 거꾸로 출력
        int[] arr3 = {6, 7, 8, 9, 10};
        for(int i = arr3.length; i > 0; i--){
            System.out.println(arr3[i-1]);
        }

        // 배열 안의 숫자들의 합
        int sum = 0;
        int[] arr4 = {10, 20, 30, 40, 50};
        for(int i = 0; i < arr4.length; i++){
            sum += arr4[i];
        }
        System.out.println(sum);
    }
}
