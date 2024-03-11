package day6;

public class AccessModifierSimulation {
    public static void main(String[] args) {
        // 문제 : 사람의 id를 출력해주세요.
        // 조건 : 사람의 id를 20으로 설정해주세요.
        // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
        // 조건 : 사람 클래스에서 출력할 수 없습니다.
        Person p1 = new Person();
    //    p1.id = 20;
        p1.setId(20);

        System.out.println("제 번호는 " + p1.getId() + " 입니다.");
        // 출력 : 제 번호는 20 입니다.

        p1.setAge(10); // 나이가 음수인것은 이상하다.
        //p1.printAge();
    }
}

class Person {
    private int id;
    private int age;
    private String name;
    private String address;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.

    // 카멜표기법 : 단어 여러개 조합을 명명할 때 의미가 바뀌는 부분에서 대문자를 넣어주는 방식
    // alt + insert => setter, getter 자동생성
    public void setId(int id) { // id setter
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}


//    public void setId(int id) { // id 세팅함수
//        this.id = id;
//    }
//
//    public int getId() { // 세팅값 가져가는 함수
//        return this.id;
//    }
//
//
//
//    public void setAge(int age) {
//        if(age < 0) {
//            System.out.println("나이는 음수가 될 수 없습니다.");
//            return;
//        }
//        this.age = age;
//    }
//    public void printAge() {
//        System.out.println("제 나이는 " + this.age + " 입니다.");
//    }
//
//}


