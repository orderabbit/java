package day5.TV1;

import day5.TV1.LGTV;
import day5.TV1.삼성TV;
import day5.TV1.샤오미TV;
import day5.TV1.표준TV;

public class TVSimulation {
    public static void main(String[] args) {

        샤오미TV a샤오미TV = new 샤오미TV();
        삼성TV a삼성TV = new 삼성TV();
        LGTV aLGTV = new LGTV();

        a샤오미TV.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미TV.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미TV.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성TV.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성TV.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성TV.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTV.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTV.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTV.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준TV 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 만든다.
        표준TV a표준TV;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        a표준TV = a샤오미TV;
        a표준TV.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준TV.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준TV = a삼성TV;
        a표준TV.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준TV.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준TV = aLGTV;
        a표준TV.켜기();
        // 출력 : LGTV 켜집니다.
        a표준TV.끄기();
        // 출력 : LGTV 꺼집니다.


        LGTV aLGTv2 = (LGTV)a표준TV;
        aLGTv2.게임모드전환();
    }
}
