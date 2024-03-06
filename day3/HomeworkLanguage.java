package day3;

public class HomeworkLanguage {
    public static void main(String[] args) {
        print(4); // 출력 : 4
        print(10); // 출력 : 10
        print(100); // 출력 : 100

        introduce();

        introduce2(3);
        introduce2(5);
        introduce2(10);

        greeting1(2);
        // 하이~
        greeting1(3);
        // 봉쥬
        greeting1(1);
        // 안녕하세요

        // 첫번째는 언어, 두번째는 횟수를 의미
        greeting2(1, 3);
        // 안녕하세요 x3
        greeting2(2, 5);
        // 하이~ x5
        greeting2(3, 7);
        // 봉쥬 x7
    }
    public static void print(int num1){
        System.out.println(num1);
    }
    public static void introduce(){
        for(int i = 0; i < 10; i++){
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        }
    }
    public static void introduce2(int cnt){
        for(int i = 0; i < cnt; i++){
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.!");
        }
    }
    public static void greeting1(int lang){
        if(lang == 1)
            System.out.println("안녕하세요");
        else if(lang == 2)
            System.out.println("하이");
        else if(lang == 3)
            System.out.println("봉쥬");
    }
    public static void greeting2(int lang, int cnt2){
        for(int i = 0; i < cnt2; i++){
            greeting1(lang);
        }
    }
}
