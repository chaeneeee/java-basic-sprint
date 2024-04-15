package java20240412;

public class example3_2 {
    public static void main(String[] args) {


        //1부터 100까지 정수 중에서 짝수만
        //int 타입을 갖는 결과담을 변수 지정
        //1부터 100까지 돌면서 2%=0 인 결과를 모아야한다.
        //1부터 100까지 배열을 만들고
        //result 값을 갖는 배열을 넣어야할까 ?
        //아님 카운트 값을 정하고 해당 될때마다 ++ x 그럼 숫자 반환이 x

//        int count = 0;
//        int [ ] totalarray = new int [100];
        for(int i=1; i<=100; i++){
            if (i%2==0){
                System.out.println(i);



            }
        }

    }
}
