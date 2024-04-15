package java20240412;

import java.util.Scanner;

public class example3_3 {


    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.println("숫자를 입력해주세요");
    int num = scanner.nextInt();
    int sum=0;
    //숫자 n부터 입력 받아 , 1부터 n 까지 합을 계산해서 출력
    if (num<0 ){
        System.out.println("음수는 입력하면 아니되오");
    }else { for (int i=0; i<=num; i++){
        sum+=i;
    } System.out.println(sum);
    }

}

}





