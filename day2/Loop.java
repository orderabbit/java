package day2;

public class Loop {
    public static void main(String[] args){

        // 반복문을 이용해 동일한 명령을 여러번 실행

//        while(true) {
//            System.out.println("실행");
//        }

        // 원하는 만큼만 반복
        int cnt = 0; // 반복횟수 세는 용도

        while (cnt < 5) { // 5번 반복
            System.out.println("실행");
            cnt++;
        }

        // for문
        for(int cnt2 = 0; cnt2 < 5; cnt2++) {
            System.out.println("실행");
        }



        // 1부터 10까지 출력 -v1
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // 1부터 10까지 짝수 출력 -v2
        for(int i = 2; i <= 10; i += 2){
            System.out.println(i);
        }

        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        // 1부터 10까지 4의 배수 출력 -v3
        for(int i = 4; i <= 10; i += 4) {
            System.out.println(i);
        }
    }
}
