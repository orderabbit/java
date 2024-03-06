package day3;

public class HomeworkStaticHi {
    static int num = 10;
    public static void main(String[] args) {

            System.out.println(num); // 출력 : 10

            printValue("안녕");
            // 출력 : 안녕
    }
    public static void printValue(String hi){
        System.out.println(hi);
    }
}
