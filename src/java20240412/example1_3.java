package java20240412;

import java.util.Scanner;

public class example1_3 {
    public static void main(String[] args) {

        /**
         //         * 사용자로부터 이름과 나이를 입력 받아
         //         * 그 정보를 화면에 출력하는 간단한 프로그램 작성하세요
         //         * 이름은 숫자가 들어오면 안됩니다
         //         * 나이는 숫자만 들어와야합니다
         //         */
        // 이름과 나이를 입력받음
        //콘솔로 입력 받아야함 총 2개의 변수 필요
        // 이름과 나이 나이는 숫자 ?
        //일단 숫자 검증은 미루고 데이터를 올바르게 받고 출력하는 것부터 구현
        // 콘솔 입력을 위한 scanner 객체 형성
        Scanner sc = new Scanner(System.in);

        String name =sc.nextLine();
        String digit = "0123456789";
        for(int i =0; i < name.length(); i++){

            //숫자가 걸린다면
            if(digit.indexOf(name.charAt(i)) !=-1){
                System.out.println("이름에 숫자가 포함되어 있습니다.");
                return; //그냥 리턴하면 아무것도 반환 x
            }
        }


        //이름 검증 필요 단하나라도 숫자가 있으면 오류 메시지 출력
        String age = sc.nextLine();
        for(int i=0; i<age.length(); i++){
            if (digit.indexOf(age.charAt(i)) == -1){
                System.out.println("나이는 숫자만 입력해야 합니다.");
            }



    }
    }
}

