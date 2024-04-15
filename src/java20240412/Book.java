package java20240412;

public class Book {

    public String title;
    public  String author;
    public  int price;

    //생성자 만들기
    public  Book(String title, int price){
        this.title = title;
        this.price=price;
    }

    // 생성자 만들기 매개변수에는 필드값 넣기
    public Book (String title, String author, int price){
        this.title = title;
        this.author= author;
        this.price = price;
        //초기화

    }



    //각각을 호출하는 메서드
    //반환타입이니 void 쓰기 반환타입은 return x
    public  void printTitle() {
        System.out.println(this.title);
    }

    public void  printAuthor () {
        System.out.println(this.author);

    }

    public void printPrice() {
        System.out.println(this.price);

    }

    }

