package java20240412;

import java.util.Scanner;
public class example3_1 {

    public static void main(String[] args) {

                // n은 1 보다 작다면 1보다 큰 수 넣도록
                //숫자를 입력받아 이 숫자가 양수인지 음수인지 0인지 판단하는
                // 숫자를 스캐너로 입력받는다.
                Scanner sc = new Scanner(System.in);
                System.out.println("숫자를 입력해주세요!");
                int num = sc.nextInt();
                //입력받을 숫자 음수인지 양수인지 내보낼 String 타입으로
                // 변수 지정한다
                String result;
                // if 문으로 사용자에게 받은 num >0
                if (num == 0) {
                    result = "0 입니다";
                } else if (num > 0) {
                    result = "입력하신 숫자는 양수 입니다.";
                } else {
                    result = "입력하신 숫자는 음수 입니다.";
                    //num< 0
                    // num =0 인 경우



                } System.out.println(result);
    }
}
