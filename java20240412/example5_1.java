package java20240412;

public class example5_1 {

    public static void main(String[] args) {
// person 클래스를 생성하고
//        이름 나이를 필드로 가지기
//      해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와 이를 출력할 수 있는 매서드를 포함시키기
        // 이렇게 instance 만들기
        person chaeyeon1  = new person("chaeyeon", 28);
        person chaeyoen2 = new person("chaeneee", 25);
//  이렇게 새로운 값 할당하는 것 name 과 age는 person 에서 매개변수 임의 설정한 거 제대로 할당
//        System.out.println(chaeyeon.name, chaeyeon.age);
               // 이렇게 한번에 x
                //하나하나 호출

        System.out.println(chaeyeon1);  //주소값이 다른 것을 확인
        System.out.println(chaeyoen2);

//        System.out.println(chaeyeon1.name);
//        System.out.println(chaeyeon1.age);
//        chaeyeon1.introduce();



    }

}
