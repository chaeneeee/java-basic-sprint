package java20240412;

public class example5_2 {
    public static void main(String[] args) {

        // book 클래스를 만들고 제목 저자 가격 을 필드로 정의히기
        //모든 필드를 초기화 하는 필드값ㅇ르 출력하는 메서드 포함
        //person 객체 두개 생성하고 각 객체에 대한 정보를 출력
        //이어 book 객체를 생성하고 그 정보를 출력하세엽


        //변수명은 항상 소문자 시작 타입 class 명은 대문자 시작  !!!!
        Book book = new Book("객체지향의 사실과 오해", "조영호", 10000);
//자꾸 new class 명 뒤 매개변수에 넣는 값 까먹지 말기  내가 넣고싶은 정해놓은 필드값 넣는 것
//        System.out.println( book.title, book.author,book.price );
    ///이렇게 호출이아니고 하나씩 호출

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);
        book.price = 12000;
        book.printPrice();  //  메서드 호출
                            //값을 변경할 수 있다. 근데 위험하다
        System.out.println(StringUtil.concat("java", "spring" , " react"));
        //2개일때도 3개일때도 매개변수에 따라 호출 완료

    }



}




