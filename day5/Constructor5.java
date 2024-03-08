package day5;

public class Constructor5 {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람5().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}

class 사람5{
    public 사람5(){
    }
    팔3 a왼팔 = new 팔3();
}

class 팔3{
    손 a손 = new 손();
}

class 손{
    엄지손가락 a엄지손가락 = new 엄지손가락();
}

class 엄지손가락{
    int 길이 = 5;
}
