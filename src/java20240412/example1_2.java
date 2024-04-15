package java20240412;

import java.util.Scanner;

public class example1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("첫 번째 숫자를 입력해주세요");
      int num1 = scanner.nextInt();
        System.out.printf("두 번째 숫자를 입력해주세요");
      int num2 = scanner.nextInt();


        int result;
        System.out.printf("덧셈 결과는"+ " ");
        System.out.println(num1+num2);
        System.out.printf("곱셈 결과는"+ " ");
        System.out.println(num1*num2);
        System.out.printf("뺄셈 결과는"+ " ");
        System.out.println(num1-num2);
        System.out.printf("나눗셈 결과는"+ " ");
        System.out.println(num1/num2);



    }
}
