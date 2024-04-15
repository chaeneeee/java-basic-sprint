package java20240412;

public class example5_3 {
    public static void main(String[] args) {
        /**
         * person 객체 두 개 생성
         * 각 객체에 대한 정보를 출력
         * 이어서  booK 개체를 생성하고 그 정보를 출력
         *
         */
                                                        // 이건 instance 를 만드는 것 겸 생성자 호출
        person person1 = new person("chaeyeon" , 28); //생성자의 매개변수
        person person2 = new person("coding", 25); //new > 초기화 생성자 호출
                                                      //만약 생성자 안 만들고
                                                        //new로 인스턴스 만들면 기본 생성자가 호출
                                                        //


//        person person1 = new person();  // 만약 person class에 person 생성자가 없더라도 이렇게 쓸 수있음 기본 생성자가 자동으로 만들어져서
                                        //초기화만되고 할당된 값은 없음.   근데 위에 생성자가 만들어지면 기본생성자가 안 만들어져서 오류뜸

        Book book  = new Book("자바기초",8000);
        //민약 할당하지 않고 호출하면 초기값인 null 이나온다.
        //밑에 작가를 할당을 안하고 호출하니 null 결과값이 나온다

        person1.introduce();
        person2.introduce();
        book.printPrice();
        book.printAuthor();

    }
}
