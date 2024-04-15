package java20240412;

public class person {

    public String name;
    public int age;
//필드 멤버변수


//매개변수임  위에 핑크 name 이랑 다른 거임
    //지역변수와 전역변수가 이름이 같을 때 메서드 안에서는 지역변수가 우선시
    //그래서 선언한 이름이 같은 멤버 변수인 필드값을 가져오기 위해서는 this 를 통해 필드변수 가져와야힘
    public person(String name, int age){
        this.name = name;  // 생상자도 메서드 일종
        this.age = age;
    }
        public void introduce() {
            System.out.printf("제 이름은 %s 제 나이는 %d 입니다",name,age );
        }

}


