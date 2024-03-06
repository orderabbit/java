package day1;

public class Operator {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        // +, -, *, /, %
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 3);
        System.out.println(10.0 / 3.0); // 정수와 정수의 계산 결과는 정수, 실수로 계산하려면 실수로 나누기
        System.out.println(10 % 3);

        // 비교연산자
        // >, <, >=, <=, ==, !=
        // true, false -> 논리값(boolean)으로 결과가 나온다.
        System.out.println(10 > 5);
        System.out.println(10 < 5);

        System.out.println(5 > 5); // false
        System.out.println(5 >= 5); // true

        System.out.println(5 == 5); // true
        System.out.println(5 != 5); // false

        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참");
        }
    }
}
