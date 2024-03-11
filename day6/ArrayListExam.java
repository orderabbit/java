package day6;
import java.util.ArrayList;

// {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.
// ArrayList의 사이즈를 출력해주세요.
// ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 )
// 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주세요
// List의 모든 값을 출력해주세요.
public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 정수를 저장할 수 있는 ArrayList를 선언하고 만들어주세요.
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        // 리스트에 값을 추가해주세요.


        // size()
        // 리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        System.out.println(list.size());
        // 출력결과 : 6


        // get()
        // 리스트의 3,4번째 값을 출력해주세요.
        int rst = list.get(2);
        int rst2 = list.get(3);
        System.out.println(rst);
        System.out.println(rst2);
        // 출력결과 : 3, 2



        // remove()
        // 리스트의 1,2번째 값을 지운 뒤, 다시 3,4번째 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        list.remove(0);
        list.remove(0);
        int rst3 = list.get(2);
        int rst4 = list.get(3);
        System.out.println(rst3);
        System.out.println(rst4);
        // 출력 결과 : 1, 0


        // 반복문으로 출력.
        //
        // 리스트의 모든 값을 출력해주세요.
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        // 출력 결과 : 3, 2, 1, 0

    }
}
